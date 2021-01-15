package com.example.demo.mybatis;

public interface TestUserTabDao {

    int deleteByPrimaryKey(Integer userid);

    int insert(TestUserTab record);

    int insertSelective(TestUserTab record);

    TestUserTab selectByPrimaryKey(Integer userid);

    int updateByPrimaryKeySelective(TestUserTab record);

    int updateByPrimaryKey(TestUserTab record);
}