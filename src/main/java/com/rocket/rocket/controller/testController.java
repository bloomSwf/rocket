package com.rocket.rocket.controller;

import com.rocket.rocket.entity.CisInPatReg;
import com.rocket.rocket.rocketMq.RocketMQProvider;
import com.rocket.rocket.service.TestMybatisService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 *  测试
 */
@RestController
public class testController {
    @Autowired
    private RocketMQProvider rocketMQProvider;

    @Autowired
    private TestMybatisService testMybatisService;

    @RequestMapping(value = "/tset",method = RequestMethod.GET)
    public String test() {
        return "constant";
    }

    @RequestMapping("/testMq")
    public void testMq() {
        rocketMQProvider.defaultMQProducer();
    }

    @RequestMapping("/testMybatis")
    public void testMybatis() {
        Long visitId = Long.valueOf("180424101000002");
        CisInPatReg cisInPatReg = testMybatisService.findByVisitId(visitId);
        System.out.println(cisInPatReg);
    }
}
