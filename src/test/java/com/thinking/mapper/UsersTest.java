package com.thinking.mapper;

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
		user.setUsername("lyq");
		user.setPassword("123456");
		Assert.assertNotNull(um.selectByUserName(user));
	}
}
