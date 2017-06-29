package com.thinking.test;

import org.junit.Before;
import org.junit.runner.RunWith;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations="classpath:applicationContext.xml")
public class BaseTest {
	ApplicationContext applicationContext;
	@Before
	public void setUp() throws Exception {
		//º”‘ÿspring≈‰÷√Œƒº˛
		applicationContext=new ClassPathXmlApplicationContext("applicationContext.xml");
	}

}