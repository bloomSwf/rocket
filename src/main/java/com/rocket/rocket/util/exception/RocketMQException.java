package com.rocket.rocket.util.exception;

import com.alibaba.fastjson.JSONObject;

import java.io.PrintWriter;

public class RocketMQException extends DescribableException{
    public static final String MESSAGE_KEY_CODE = "code";
    public static final String MESSAGE_KEY_MSG = "msg";
    public static final String MESSAGE_KEY_DATA = "data";

    public RocketMQException(Describable describableInfo) {
        super(describableInfo);
    }

    public RocketMQException(Integer code, String msg) {
        super(code, msg);
    }

    public RocketMQException(Describable describableInfo, Object data) {
        super(describableInfo, data);
    }

    /** @deprecated */
    @Deprecated
    public RocketMQException(Describable describableInfo, String detail, Object data) {
        super(describableInfo.getCode(), detail, data);
    }

    public RocketMQException(Integer code, String msg, Object data) {
        super(code, msg, data);
    }

    public void printStackTrace(PrintWriter pw) {
        JSONObject jsonObject = new JSONObject();
        jsonObject.put("code", super.getCode());
        jsonObject.put("msg", super.getMsg());
        jsonObject.put("data", super.getData());
        pw.print(jsonObject.toJSONString());
    }
}
