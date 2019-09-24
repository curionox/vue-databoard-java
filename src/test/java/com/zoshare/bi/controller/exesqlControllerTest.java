package com.zoshare.bi.controller;

import com.zoshare.bi.mapper.ExesqlMapper;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.Assert.*;

/**
 * @Description:
 * @Author： yehh
 * @Date: Creater in 2019/9/19 10:41
 * @Modified by:
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class exesqlControllerTest {
    @Autowired
    private ExesqlMapper exesqlMapper;
    @Test
    public void tables() {
        System.out.println(exesqlMapper.getTableName());
    }
}