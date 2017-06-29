package com.thinking.mapper;

import com.thinking.bean.Characters;

public interface CharactersMapper {
    int deleteByPrimaryKey(Integer charactertype);

    int insert(Characters record);

    int insertSelective(Characters record);

    Characters selectByPrimaryKey(Integer charactertype);

    int updateByPrimaryKeySelective(Characters record);

    int updateByPrimaryKey(Characters record);
}