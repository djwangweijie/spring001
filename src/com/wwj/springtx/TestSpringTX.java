package com.wwj.springtx;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Component;

@Component(value="testTX")
public class TestSpringTX {
	
	@Autowired
	private  PayMoney  pays;
	
	public void test1(){
		pays.paymoney(1,1000, 2);
	}
	
	public static void main(String[] args) {	
		ApplicationContext ac=new ClassPathXmlApplicationContext("application4.xml");
		TestSpringTX  tx   = (TestSpringTX) ac.getBean("testTX");
		tx.test1();
	}

}
