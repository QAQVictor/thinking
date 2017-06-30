package com.thinking.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.thinking.bean.Users;
import com.thinking.mapper.UsersMapper;

/**
 * 作者 李亚卿 日期：2017年6月29日 公司：ArteonWMS 描述：用户业务逻辑实现
 */
@Service
public class UsersServiceImpl implements UsersServiceI {
	@Autowired
	private UsersMapper um;

	public boolean login(Users user) {
		// 用户登录
		if (um.selectByUserName(user) != null) {
			return true;
		} else {
			return false;
		}
	}

	public boolean addUser(Users user) {
		// 添加用户
		if (um.insert(user) > 0) {
			return true;
		} else {
			return false;
		}
	}

	public List<Users> findAllUsers() {
		// 查找所有用户
		List<Users> usersList = um.selectAll();
		if (usersList != null) {
			for (Users user : usersList) {
				System.out.println(user.getUserName());
			}
			return usersList;
		} else {
			return null;
		}
	}

	public Users findById(int id) {
		// 根据用户id查找
		System.out.println(um.selectByPrimaryKey(id).getUserName());
		return um.selectByPrimaryKey(id);

	}

	public boolean update(Users user) {
		// 更新用户数据
		if (um.updateByPrimaryKey(user) > 0) {
			System.out.println(um.selectByPrimaryKey(user.getUserId()));
			return true;
		}
		return false;
	}

	public int delete(int id) {
		// 删除用户
		return um.deleteByPrimaryKey(id);
	}
	public int deleteByWhere(List<Integer> list) {
		// 批量删除用户，返回删除数目
		return um.deleteByWhere(list);
	}
}
