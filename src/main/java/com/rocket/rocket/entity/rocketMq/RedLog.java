package com.rocket.rocket.entity.rocketMq;

import java.math.BigDecimal;

public class RedLog {
    private String redId;

    private String userId;

    private BigDecimal amount;

    public String getRedId() {
        return redId;
    }

    public void setRedId(String redId) {
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
