package com.wwj.jdkproxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
/**
 * 动态代理接口
 * @author Yun
 *
 */
public class Myhanlder implements  InvocationHandler{

	//需要被代理的真实角色
	 private Object  target;
	 
	 public Myhanlder(Object obj) {
		// TODO Auto-generated constructor stub
		 this.target  = obj;
	}
	@Override
	public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
		// TODO Auto-generated method stub
		//执行真实角色拥有的方法 ,args代表如果有参数执行有参数
		Object  o  = method.invoke(target, args);
		return o;
	}

}
