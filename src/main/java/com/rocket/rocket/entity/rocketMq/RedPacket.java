package com.rocket.rocket.entity.rocketMq;

import java.math.BigDecimal;

public class RedPacket {
    private String Id;

    private Integer num;

    private BigDecimal amount;

    private Integer robotNum;

    public String getId() {
        return Id;
    }

    public void setId(String id) {
        Id = id;
    }

    public Integer getNum() {
        if (num == null) {
            return 0;
        }
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

    public Integer getRobotNum() {
        return robotNum;
    }

    public void setRobotNum(Integer robotNum) {
        this.robotNum = robotNum;
    }
}