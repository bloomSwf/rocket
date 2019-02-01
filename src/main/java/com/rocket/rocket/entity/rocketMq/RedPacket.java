package com.rocket.rocket.entity.rocketMq;

import java.math.BigDecimal;

public class RedPacket {
    private Integer Id;

    private Integer num;

    private BigDecimal amount;

    public Integer getId() {
        return Id;
    }

    public void setId(Integer id) {
        Id = id;
    }

    public Integer getNum() {
        return num;
    }

    public void setNum(Integer num) {
        this.num = num;
    }

    public BigDecimal getAmount() {
        return amount;
    }

    public void setAmount(BigDecimal amount) {
        this.amount = amount;
    }
}