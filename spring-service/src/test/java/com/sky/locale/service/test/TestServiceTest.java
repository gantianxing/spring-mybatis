package com.sky.locale.service.test;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.annotation.Resource;

/**
 * Created by gantianxing on 2017/6/27.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes=AllBeanConfig.class)
public class TestServiceTest {

    @Autowired(required = false)
    private TestService testService;

    @Test
    public void testAdd(){
        com.sky.locale.dao.domain.Test t = new com.sky.locale.dao.domain.Test();
        t.setName("123");
        t.setSex(true);
        if(testService != null){
            testService.add(t);
        }else {
            System.out.println("bean装配失败");
        }

    }

    @Test
    public void TestFind(){
        if(testService != null){
            System.out.println(testService.find(1));
        }else {
            System.out.println("bean装配失败");
        }
    }
}
