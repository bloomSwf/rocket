package com.rocket.rocket.rocketMq.consumer;

import com.alibaba.rocketmq.client.consumer.DefaultMQPushConsumer;
import com.alibaba.rocketmq.client.consumer.listener.ConsumeConcurrentlyStatus;
import com.alibaba.rocketmq.client.consumer.listener.MessageListenerConcurrently;
import com.alibaba.rocketmq.common.consumer.ConsumeFromWhere;
import com.alibaba.rocketmq.common.message.MessageExt;
import com.rocket.rocket.entity.rocketMq.RedLog;
import com.rocket.rocket.entity.rocketMq.RedPacket;
import com.rocket.rocket.rocketMq.consumer.processor.listener.MQConsumeMsgListenerProcessor;
import com.rocket.rocket.util.constant.LocalCache;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.util.UUID;

@Service
public class RedConsumer implements ApplicationRunner {

    private Logger logger = Logger.getLogger(RedConsumer.class);
    /**
     * 消费者的组名
     */
    @Value("${apache.rocketmq.consumer.PushConsumer}")
    private String consumerGroup;

    /**
     * NameServer 地址
     */
    @Value("${apache.rocketmq.namesrvAddr}")
    private String namesrvAddr;

    @Autowired
    private MQConsumeMsgListenerProcessor processor;

    public void defaultMQPushConsumer() {
        for (int i = 0; i < LocalCache.robotNum; i++) {
            String UUID = java.util.UUID.randomUUID().toString();
            System.out.println("机器人"+ (i+1) +"ID：" + UUID);
            //消费者的组名
            DefaultMQPushConsumer consumer = new DefaultMQPushConsumer(UUID);

            //指定NameServer地址，多个地址以 ; 隔开
            consumer.setNamesrvAddr(namesrvAddr);
            try {
                consumer.subscribe(LocalCache.topic, "*");

                //设置Consumer第一次启动是从队列头部开始消费还是队列尾部开始消费
                //如果非第一次启动，那么按照上次消费的位置继续消费
                consumer.setConsumeFromWhere(ConsumeFromWhere.CONSUME_FROM_LAST_OFFSET);
                //自定义消息处理器
                consumer.registerMessageListener((MessageListenerConcurrently) (list, context) -> {//->为Java8的lambda表达式,就是匿名函数
                    try {
                        for (MessageExt messageExt : list) {
//                            String topic = messageExt.getTopic();
//                            String tags = messageExt.getTags();
                            String messageBody = new String(messageExt.getBody());
                            RedLog redLog = new RedLog();
                            String[] msgs = messageBody.split(":");
                            redLog.setRedId(msgs[2]);
                            redLog.setAmount(new BigDecimal(msgs[1].substring(0, msgs[1].length() - 2)));
                            redLog.setUserId(UUID);
                            String msgId = messageExt.getMsgId();
                            Boolean flag = true;
                            RedPacket redPacket = LocalCache.redPacketMap.get(redLog.getRedId());
                            int size = LocalCache.getRedLogMap.size();
                            if (size >= redPacket.getNum()) {
                                break;
                            }
                            for (Object key : LocalCache.getRedLogMap.keySet()) {
                                String keyValue = (String) key;
                                if (keyValue.equals(msgId)) {
                                    flag = false;
                                    break;
                                }
                                RedLog redLog1 = (RedLog) LocalCache.getRedLogMap.get(keyValue);
                                if (redLog1.getUserId().equals(UUID)) {
                                    flag = false;
                                    break;
                                }
                            }
                            if (flag) {
                                LocalCache.getRedLogMap.put(msgId, redLog);
                            }
                        }
                    } catch (Exception e) {
                        e.printStackTrace();
                        return ConsumeConcurrentlyStatus.RECONSUME_LATER; //稍后再试
                    }
                    return ConsumeConcurrentlyStatus.CONSUME_SUCCESS; //消费成功
                });
                consumer.start();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    @Override
    public void run(ApplicationArguments args) throws Exception {
        System.out.println("RedConsumer初始化...");
        defaultMQPushConsumer();
    }
}
