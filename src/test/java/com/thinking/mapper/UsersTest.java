package com.thinking.mapper;

import java.util.List;

import org.junit.Assert;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import com.thinking.bean.Users;
import com.thinking.test.BaseTest;

public class UsersTest extends BaseTest {
	@Autowired
	UsersMapper um;
	@Test
	public void testSelect(){
		Users user=new Users();
		user.setUserName("lyq");
		user.setPassword("123456");
		System.out.println(um.selectByUserName(user));
		//Assert.assertNotNull(um.selectByUserName(user));
	}
	@Test
	public void testSelectAll(){
		List<Users> list=um.selectAll();
		for(Users user:list){
			System.out.println(user.getUserName());
		}
	}
}
