package com.wwj.diimpl;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestDi {
	
		public static void main(String[] args) {
			ApplicationContext ac=new ClassPathXmlApplicationContext("application.xml");
			//属性
			Vmodel v1  = (Vmodel) ac.getBean("v1");
			System.out.println(v1.getVp().getVpname());
			//构造方法
			Vmodel v2  = (Vmodel) ac.getBean("v2");
			System.out.println(v2.getVname());
			//复杂类型
			Vmodel v3  = (Vmodel) ac.getBean("v3");
			System.out.println(v3.getArr().length);
			System.out.println(v3.getList().size());
			System.out.println(v3.getMap().size());
		}

}
