package com.rocket.rocket.util.exception;

public interface Describable {
    Integer ENUM_SUCCESS_CODE = 0;
    String ENUM_SUCCESS_MSG = "成功";
    Integer ENUM_FAIL_CODE = 999999;
    String ENUM_FAIL_MSG = "失败";

    Integer getCode();

    String getMsg();
}
