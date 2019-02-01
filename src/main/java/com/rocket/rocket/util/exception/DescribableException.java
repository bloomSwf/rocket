package com.rocket.rocket.util.exception;

public abstract class DescribableException extends RuntimeException {
    private Integer code;
    private String msg;
    private Object data;

    public DescribableException(Describable describableInfo) {
        super(describableInfo.getMsg());
        this.code = describableInfo.getCode();
        this.msg = describableInfo.getMsg();
    }

    public DescribableException(Integer code, String msg) {
        super(msg);
        this.code = code;
        this.msg = msg;
    }

    public DescribableException(Describable describableInfo, Object data) {
        super(describableInfo.getMsg());
        this.code = describableInfo.getCode();
        this.msg = describableInfo.getMsg();
        this.data = data;
    }

    public DescribableException(Integer code, String msg, Object data) {
        super(msg);
        this.code = code;
        this.msg = msg;
        this.data = data;
    }

    public Integer getCode() {
        return this.code;
    }

    public void setRet(Integer code) {
        this.code = code;
    }

    public String getMsg() {
        return this.msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public Object getData() {
        return this.data;
    }

    public void setData(Object data) {
        this.data = data;
    }

    public void setCode(Integer code) {
        this.code = code;
    }
}
