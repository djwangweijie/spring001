package com.wwj.anotation;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Component;

@Component(value="test")
public class Testanotation {
		@Autowired
		private  FindService  fs ;	
		public  void A(){
			fs.FindDandM();
		}
		public static void main(String[] args) {
			ApplicationContext ac=new ClassPathXmlApplicationContext("application2.xml");
			Testanotation tt = (Testanotation) ac.getBean("test");
			tt.A();
		}
}
