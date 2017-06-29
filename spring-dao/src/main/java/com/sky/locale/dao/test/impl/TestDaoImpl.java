package com.sky.locale.dao.test.impl;

import com.sky.locale.dao.domain.Test;
import com.sky.locale.dao.mapper.TestMapper;
import com.sky.locale.dao.test.TestDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

/**
 * Created by gantianxing on 2017/6/27.
 */
@Repository
@Component
public class TestDaoImpl implements TestDao {

    @Autowired
    private TestMapper mapper;

    @Override
    public void add(Test record) {
        mapper.insert(record);
    }

    @Override
    public Test find(int id) {
        return mapper.selectByPrimaryKey(id);
    }
}
