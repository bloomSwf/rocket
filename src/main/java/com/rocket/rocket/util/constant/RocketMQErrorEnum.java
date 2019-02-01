package com.rocket.rocket.util.constant;

import com.rocket.rocket.util.exception.Describable;

public enum RocketMQErrorEnum implements Describable {
    NOT_FOUND_CONSUMESERVICE(1, "服务未找到"),
    HANDLE_RESULT_NULL(2, "服务处理结果未返回"),
    CONSUME_FAIL(3, "消息处理失败")
    ;
    /**
     * 值
     */
    private Integer code;

    /**
     * 描述信息
     */
    private String msg;

    RocketMQErrorEnum(Integer code, String msg) {
        this.code = code;
        this.msg = msg;
    }

    @Override
    public Integer getCode() {
        return code;
    }
    @Override
    public String getMsg() {
        return msg;
    }
}
