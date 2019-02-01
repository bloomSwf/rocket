package com.rocket.rocket.service.impl;

import com.rocket.rocket.entity.CisInPatReg;
import com.rocket.rocket.mybatis.CisInPatRegMapper;
import com.rocket.rocket.service.TestMybatisService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TestMybatisServiceImpl implements TestMybatisService {
    @Autowired
    private CisInPatRegMapper cisInPatRegMapper;

    @Override
    public CisInPatReg findByVisitId(Long visitId) {
        return cisInPatRegMapper.selectByPrimaryKey(visitId);
    }
}
