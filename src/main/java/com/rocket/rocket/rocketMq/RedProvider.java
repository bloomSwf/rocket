package com.rocket.rocket.rocketMq;

import com.alibaba.rocketmq.client.producer.DefaultMQProducer;
import com.alibaba.rocketmq.client.producer.MessageQueueSelector;
import com.alibaba.rocketmq.client.producer.SendResult;
import com.alibaba.rocketmq.common.message.Message;
import com.alibaba.rocketmq.common.message.MessageQueue;
import com.rocket.rocket.entity.rocketMq.RedPacket;
import com.rocket.rocket.entity.rocketMq.RedPacketUtils;
import com.rocket.rocket.util.constant.LocalCache;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.util.StopWatch;

import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

@Service
public class RedProvider {
    /**
     * 生产者的组名
     */
    @Value("${apache.rocketmq.producer.producerGroup}")
    private String producerGroup;

    /**
     * NameServer 地址
     */
    @Value("${apache.rocketmq.namesrvAddr}")
    private String namesrvAddr;
    public void defaultMQProducer(RedPacket redPacket) {
        //生产者的组名
        DefaultMQProducer producer = new DefaultMQProducer(producerGroup);

        //指定NameServer地址，多个地址以 ; 隔开
        producer.setNamesrvAddr(namesrvAddr);

        try {
            producer.start();
            List<BigDecimal> amounts = RedPacketUtils.splitRedPackets(redPacket);
//            BigDecimal redAmount = redPacket.getAmount().divide(new BigDecimal(redPacket.getNum())).setScale(2,4);
//            Message message = new Message(LocalCache.topic, "*", ("你抢到了:"+redAmount.toString()+"元:" + redPacket.getId()).getBytes());

            for (int i = 0; i < redPacket.getNum(); i++) {
                Message message = new Message(LocalCache.topic, "*", ("你抢到了:"+amounts.get(i)+"元:" + redPacket.getId()).getBytes());
                SendResult result = producer.send(message,new MessageQueueSelector() {
                    @Override
                    public MessageQueue select(List<MessageQueue> mqs, Message msg, Object arg) {
                        Integer id = (Integer) arg;
                        int index = id % mqs.size();
                        return mqs.get(index);
                    }
                },1);
                System.out.println("发送响应：MsgId:" + result.getMsgId() + "，发送状态:" + result.getSendStatus());
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            producer.shutdown();
        }
    }
}