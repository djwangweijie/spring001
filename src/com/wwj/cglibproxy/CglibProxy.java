package com.wwj.cglibproxy;

import java.lang.reflect.Method;

import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

public class CglibProxy implements MethodInterceptor {

	/**
	 * 通过拦截真实对象的方法
	 */
	@Override
	public Object intercept(Object o, Method method, Object[] objects, MethodProxy methodProxy) throws Throwable {
		// TODO Auto-generated method stub
		Object obj = methodProxy.invokeSuper(o, objects);
		return obj;
	}

}
