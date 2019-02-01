package com.rocket.rocket.util.constant;

public enum TopicEnum {
    DemoTopic(1,"test"),
    ;
    /**
     * 值
     */
    private Integer code;

    /**
     * 描述信息
     */
    private String topic;

    TopicEnum(Integer code, String topic) {
        this.code = code;
        this.topic = topic;
    }

    public Integer getCode() {
        return code;
    }
    public String getTopic() {
        return topic;
    }
}
