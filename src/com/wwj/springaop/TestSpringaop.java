package com.wwj.springaop;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSpringaop {
		public static void main(String[] args) {
			ApplicationContext ac=new ClassPathXmlApplicationContext("application3.xml");
			UserService userService = (UserService) ac.getBean("userService");
			userService.save();
		}
}
