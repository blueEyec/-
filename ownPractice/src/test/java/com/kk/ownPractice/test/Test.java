package com.kk.ownPractice.test;


import java.util.List;

import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.kk.ownPractice.Application;
import com.kk.ownPractice.entity.User;
import com.kk.ownPractice.service.UserService;

@RunWith(value = SpringJUnit4ClassRunner.class)
@SpringBootTest(classes={Application.class})
public class Test {
	@Autowired
	private static UserService userService;
	
	@org.junit.Test
	public void fun1() {
		User user=userService.getList(1);
		System.out.println(user);
	}
}
