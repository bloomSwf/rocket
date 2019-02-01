package com.rocket.rocket.service;

import com.rocket.rocket.entity.CisInPatReg;

public interface TestMybatisService {
    CisInPatReg findByVisitId(Long visitId);
}
