package com.thinking.service;

import java.util.ArrayList;
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
		System.out.println(usi.delete(6));
	}
	@Test
	public void testdeleteByWhere(){
		List<Integer>list =new ArrayList<Integer>();
		list.add(7);
		list.add(9);
		System.out.println(usi.deleteByWhere(list));
	}
}
