package com.wwj.jdkproxy;

import java.lang.reflect.Proxy;

public class TestJdkProxy {
		public static void main(String[] args) {
			//构建真实角色
			InterPerson  ip = new RealPerson();
			//通过proxy类进行代理角色创建
			InterPerson iproxy = (InterPerson) Proxy.newProxyInstance(InterPerson.class.getClassLoader(),new Class[] {InterPerson.class} , new Myhanlder(ip));
			iproxy.sayA();
			iproxy.sayB("ahha");
		}
}
