package com.wwj.cglibproxy;

import net.sf.cglib.proxy.Enhancer;

public class TestCglib {

	public static void main(String[] args) {
		//构建一个增强类
		Enhancer  eh  = new Enhancer();
		// 增强类需要设置被代理的类型。以及代理的方法的回调
		eh.setSuperclass(NewRole.class);
		eh.setCallback(new CglibProxy());
		//构建代理类
		NewRole  nr = (NewRole) eh.create();
		nr.go();
		nr.gohome();
		
	}
}
