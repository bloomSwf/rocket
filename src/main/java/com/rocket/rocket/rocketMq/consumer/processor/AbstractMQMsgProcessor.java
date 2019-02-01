package com.rocket.rocket.rocketMq.consumer.processor;

import java.util.Arrays;
import java.util.List;

import com.rocket.rocket.entity.rocketMq.MQConsumeResult;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.alibaba.rocketmq.common.message.MessageConst;
import com.alibaba.rocketmq.common.message.MessageExt;

public abstract class AbstractMQMsgProcessor implements MQMsgProcessor{

    protected static final Logger logger = LoggerFactory.getLogger(AbstractMQMsgProcessor.class);

    @Override
    public MQConsumeResult handle(String topic, String tag, List<MessageExt> msgs) {
        MQConsumeResult mqConsumeResult = new MQConsumeResult();
        /**可以增加一些其他逻辑*/

        for (MessageExt messageExt : msgs) {
            //消费具体的消息，抛出钩子供真正消费该消息的服务调用
            mqConsumeResult = this.consumeMessage(tag,messageExt.getKeys()==null?null:Arrays.asList(messageExt.getKeys().split(MessageConst.KEY_SEPARATOR)),messageExt);
        }

        /**可以增加一些其他逻辑*/
        return mqConsumeResult;
    }
    /**
     * 消息某条消息
     * @param tag 标签
     * @param keys 消息关键字
     * @param messageExt
     * @return
     */
    protected abstract MQConsumeResult consumeMessage(String tag,List<String> keys, MessageExt messageExt);

}
