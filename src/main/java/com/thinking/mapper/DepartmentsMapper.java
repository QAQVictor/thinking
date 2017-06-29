package com.thinking.mapper;

import com.thinking.bean.Departments;

public interface DepartmentsMapper {
    int deleteByPrimaryKey(Integer departid);

    int insert(Departments record);

    int insertSelective(Departments record);

    Departments selectByPrimaryKey(Integer departid);

    int updateByPrimaryKeySelective(Departments record);

    int updateByPrimaryKey(Departments record);
}