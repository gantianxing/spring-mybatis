package com.sky.locale.dao.test;


import com.sky.locale.dao.domain.Test;

/**
 * Created by gantianxing on 2017/6/27.
 */
public interface TestDao {

    void add(Test record);

    Test find(int id);
}
