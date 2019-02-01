package com.rocket.rocket.rocketMq.consumer;

import com.rocket.rocket.entity.rocketMq.MQConsumeResult;
import com.rocket.rocket.rocketMq.consumer.processor.MQMsgProcessor;
import com.rocket.rocket.rocketMq.consumer.processor.listener.MQConsumeMsgListenerProcessor;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Service;
import com.alibaba.rocketmq.client.consumer.DefaultMQPushConsumer;
import com.alibaba.rocketmq.client.consumer.listener.ConsumeConcurrentlyStatus;
import com.alibaba.rocketmq.client.consumer.listener.MessageListenerConcurrently;
import com.alibaba.rocketmq.common.consumer.ConsumeFromWhere;
import com.alibaba.rocketmq.common.message.MessageExt;

import java.util.List;

@Service
public class RocketMQConsumer implements ApplicationRunner {

    private Logger logger = Logger.getLogger(RocketMQConsumer.class);
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
        //消费者的组名
        DefaultMQPushConsumer consumer = new DefaultMQPushConsumer(consumerGroup);

        //指定NameServer地址，多个地址以 ; 隔开
        consumer.setNamesrvAddr(namesrvAddr);
        try {
            //订阅PushTopic下Tag为push的消息
            consumer.subscribe("Answer_Topic", "*");

            //设置Consumer第一次启动是从队列头部开始消费还是队列尾部开始消费
            //如果非第一次启动，那么按照上次消费的位置继续消费
            consumer.setConsumeFromWhere(ConsumeFromWhere.CONSUME_FROM_FIRST_OFFSET);
            //自定义消息处理器
//            consumer.registerMessageListener(processor);
            consumer.registerMessageListener((MessageListenerConcurrently) (list, context) -> {//->为Java8的lambda表达式,就是匿名函数
                try {
                    for (MessageExt messageExt : list) {

                        System.out.println("messageExt: " + messageExt);//输出消息内容
                        String topic = messageExt.getTopic();
                        String tags = messageExt.getTags();

                        String messageBody = new String(messageExt.getBody());

                        System.out.println("消费响应：msgId : " + messageExt.getMsgId() + ",  msgBody : " + messageBody);//输出消息内容
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

    @Override
    public void run(ApplicationArguments args) throws Exception {
        System.out.println("RocketMQConsumer初始化...");
        defaultMQPushConsumer();
    }
}
