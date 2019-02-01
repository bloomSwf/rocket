package com.rocket.rocket.entity.rocketMq;

import java.math.BigDecimal;

public class RedLog {
    private Integer redId;

    private String userId;

    private BigDecimal amount;

    public Integer getRedId() {
        return redId;
    }

    public void setRedId(Integer redId) {
        this.redId = redId;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public BigDecimal getAmount() {
        return amount;
    }

    public void setAmount(BigDecimal amount) {
        this.amount = amount;
    }
}
