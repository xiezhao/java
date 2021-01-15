package com.example.demo;

import com.example.demo.mybatis.TestUserTab;
import com.example.demo.mybatis.TestUserTabDao;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class MybatisTest {

    @Autowired
    private TestUserTabDao testUserTabDao;

    @Test
    public void test(){
        TestUserTab testUserTab = testUserTabDao.selectByPrimaryKey(1);
        System.out.println(testUserTab);
    }
}
