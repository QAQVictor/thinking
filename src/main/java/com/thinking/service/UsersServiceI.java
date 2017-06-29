package com.thinking.service;

import java.util.List;

import com.thinking.bean.Users;

/**
 * 作者 李亚卿
 * 日期：2017年6月29日
 * 公司：ArteonWMS
 * 描述：用户业务逻辑接口
 */
public interface UsersServiceI {
	public boolean login(Users user);
	public boolean addUser(Users user);
	public List<Users> findAllUsers();
	public Users findById(int id);
	public boolean update(Users users);
	public int delete(int id);
	public int deleteByWhere(List<Integer> list);
}
