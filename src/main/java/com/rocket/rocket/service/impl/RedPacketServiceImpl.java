package com.rocket.rocket.service.impl;

import com.rocket.rocket.entity.rocketMq.RedPacket;
import com.rocket.rocket.rocketMq.RedProvider;
import com.rocket.rocket.rocketMq.RocketMQProvider;
import com.rocket.rocket.service.RedPacketService;
import com.rocket.rocket.util.constant.LocalCache;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

@Service
public class RedPacketServiceImpl implements RedPacketService {
    @Autowired
    private RedProvider redProvider;

    @Override
    public Map setRedPacket(RedPacket redPacket) {
        clearCache();
        String redId = UUID.randomUUID().toString();
        redPacket.setId(redId);
        LocalCache.redPacketMap.put(redId, redPacket);
        LocalCache.robotNum = redPacket.getRobotNum();
        redProvider.defaultMQProducer(redPacket);
        return null;
    }
    private void clearCache() {
        LocalCache.loginMap.clear();
        LocalCache.getRedLogMap.clear();
        LocalCache.redPacketMap.clear();
    }
}
