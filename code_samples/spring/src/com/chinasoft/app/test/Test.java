package com.chinasoft.app.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.chiansoft.app.service.UserService;
import com.chiansoft.app.service.impl.UserServiceImpl;

public class Test {

	public static void main(String[] args) {
//		UserService userservice=new UserServiceImpl();
//		userservice.Hello();
  
		ApplicationContext app=new ClassPathXmlApplicationContext("applicationContext.xml");
		UserService userservice=(UserService) app.getBean("userservice");
		userservice.Hello();

	}

}
