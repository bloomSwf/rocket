package com.rocket.rocket.controller;

import com.rocket.rocket.entity.rocketMq.RedPacket;
import com.rocket.rocket.service.RedPacketService;
import com.rocket.rocket.util.constant.LocalCache;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import java.math.BigDecimal;

@RestController
@RequestMapping("/")
public class RocketMqController {
    @Autowired
    private RedPacketService redPacketService;

    @RequestMapping("test")
    public String test() {
        return null;
    }

    @RequestMapping("index")
    public ModelAndView index() {
        ModelAndView mav = new ModelAndView();
        mav.setViewName("index");
        return mav;
    }

    @RequestMapping("login")
    public Object login() {
        return "login";
    }

    @RequestMapping("setRedPacket")
    public Object setRedPacket(RedPacket redPacket) {
        redPacket.setAmount(BigDecimal.TEN);
        redPacket.setNum(10);
        redPacket.setRobotNum(15);
        return redPacketService.setRedPacket(redPacket);
    }

    @RequestMapping("logMap")
    public Object setRedPacket() {
        return LocalCache.getRedLogMap;
    }
}
