package com.wwj.spring.jdbc;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestJDBC {

	
	public static void main(String[] args) {
		ApplicationContext ac=new ClassPathXmlApplicationContext("application1.xml");
		FindService  fs = (FindService) ac.getBean("FindService");
		fs.FindDandM();
	}
}
