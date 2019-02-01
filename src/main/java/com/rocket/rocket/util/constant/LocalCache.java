package com.rocket.rocket.util.constant;

import com.rocket.rocket.entity.rocketMq.RedLog;
import com.rocket.rocket.entity.rocketMq.RedPacket;

import java.util.HashMap;

public class LocalCache {
    public static HashMap<Object, Object> loginMap = new HashMap<>();

    public static HashMap<Object, RedLog> getRedLogMap = new HashMap<>();

    public static HashMap<Object, RedPacket> redPacketMap = new HashMap<>();

    public static String topic = "red";

    public static Integer robotNum = 15;
}
