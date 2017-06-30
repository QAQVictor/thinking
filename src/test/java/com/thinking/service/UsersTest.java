package com.thinking.service;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import com.thinking.bean.Users;
import com.thinking.test.BaseTest;

public class UsersTest extends BaseTest{
	@Autowired
	private UsersServiceI usi;
	@Test
	public void testdelete(){
		System.out.println(usi.delete(7));
	}
	@Test
	public void testfindAllUsers(){
		List<Users>list=usi.findAllUsers();
		for(Users user:list){
			System.out.println(user.getRealName());
		}
	}
	@Test
	public void testlogin(){
		Users user=new Users();
		user.setUserName("lyq");
		user.setPassword("123456");
		System.out.println(usi.login(user));
	}
	@Test
	public void testdeleteByWhere(){
		List<Integer>list =new ArrayList<Integer>();
		list.add(8);
		list.add(9);
		System.out.println(usi.deleteByWhere(list));
	}
	@Test
	public void testaddUser(){
		Users users=new Users();
		users.setUserId(9);
		users.setUserName("zhangsan");
		users.setRealName("ÕÅÈý");
		users.setPassword("123456");
		users.setGender("ÄÐ");
		users.setTel("123456");
		users.setEmail("123@163.com");
		Date utilDate=new Date();
		java.sql.Date sqlDate=new java.sql.Date(utilDate.getTime());
		users.setCreateDate(sqlDate);
		users.setIsDeleted("0");
		users.setCharacterType(1);
		users.setDepartId(1);
		usi.addUser(users);
	}
}
