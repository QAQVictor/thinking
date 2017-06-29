package com.thinking.mapper;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import com.thinking.test.BaseTest;

public class CharactersMapperTest  extends BaseTest {
	@Autowired
	CharactersMapper um;
	@Test
	public void testSelect(){
		System.out.println(um.selectByPrimaryKey(1).getCharactername());
	}
}
