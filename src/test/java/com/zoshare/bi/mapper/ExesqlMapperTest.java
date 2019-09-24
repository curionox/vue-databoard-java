package com.zoshare.bi.mapper;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
@RunWith(SpringRunner.class)
@SpringBootTest
public class ExesqlMapperTest {
    @Autowired
    private ExesqlMapper exesqlMapper;

    @Test
    public void getTableInfo() {
    }

    @Test
    public void testSelectOne(){
        System.out.println(exesqlMapper.selectById(1L));

//        exesqlMapper.selectBatchIds();
    }

    @Test
    public void testTkSelectOne(){

//        exesqlMapper.selectBatchIds();
    }


}