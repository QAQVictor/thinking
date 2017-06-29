package com.thinking.mapper;

import java.util.List;

import com.thinking.bean.Users;

/**
 * 作者 李亚卿
 * 日期：2017年6月29日
 * 公司：ArteonWMS
 * 描述：UsersMapper接口
 */
public interface UsersMapper {
	//根据id删除用户
    int deleteByPrimaryKey(Integer userid);
    //添加用户
    int insert(Users record);

    int insertSelective(Users record);
    //根据id查找用户
    Users selectByPrimaryKey(Integer userid);
    
    int updateByPrimaryKeySelective(Users record);
    //更新用户信息
    int updateByPrimaryKey(Users record);
    //根据用户名查找用户
    int selectByUserName(Users user);
    //查找所有用户
    List<Users> selectAll();
    
    int deleteByWhere(List<Integer>list);
}