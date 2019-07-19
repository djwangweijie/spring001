package com.wwj.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.wwj.model.User;

public class TestSpring {

	public static void main(String[] args) {
		ApplicationContext ac=new ClassPathXmlApplicationContext("application.xml");
				//2. 向容器“要”user 对象
				User u=(User) ac.getBean("t1");
				User u1 = (User) ac.getBean("t1"); 
				System.out.println(u==u1);
				//3. 打印 user 对象
				System.out.println(u.getClass().getName());
				u.invoke();
				//关闭容器
				((ClassPathXmlApplicationContext) ac).close();
	}

}
