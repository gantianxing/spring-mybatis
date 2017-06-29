package com.sky.locale.service.test.impl;

import com.sky.locale.dao.domain.Test;
import com.sky.locale.dao.test.TestDao;
import com.sky.locale.service.test.TestService;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;

/**
 * Created by gantianxing on 2017/6/27.
 */
@Component
public class TestServiceImpl implements TestService {

    @Resource
    private TestDao testDao;

    @Override
    public void add(Test record) {
        testDao.add(record);
    }

    @Override
    public Test find(int id) {
        return testDao.find(id);
    }
}
