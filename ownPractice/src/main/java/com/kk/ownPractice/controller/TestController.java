package com.kk.ownPractice.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.kk.ownPractice.entity.User;
import com.kk.ownPractice.service.UserService;


@RestController
@EnableAutoConfiguration
public class TestController {
	@Autowired
	private UserService userService;
	
	@RequestMapping("/")
	String test() {
		User users=userService.getList(1);
		System.out.println(users);
		return "hello world";
	}
}
