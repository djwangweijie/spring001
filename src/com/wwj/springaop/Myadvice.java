package com.wwj.springaop;

import org.aspectj.lang.ProceedingJoinPoint;

public class Myadvice {
	public void before() {
		System.out.println(" 这是前置通知！ ");
	}

	// 后置通知
	public void afterReturning() {
		System.out.println(" 这是后置通知 ( 如果出现异常不会调用 )");
	}

	// 环绕通知
	public Object around(ProceedingJoinPoint pjp) throws Throwable {
		System.out.println(" 这是环绕通知之前的部分！ ");
		Object proceed = pjp.proceed();// 调用目标方法
		System.out.println(" 这是环绕通知之后的部分！ ");
		return proceed;
	}

	// 异常通知
	public void afterException() {
		System.out.println(" 异常出现了！ ");
	}

	// 最终通知
	public void after() {
		System.out.println(" 这是后置通知 ( 出现异常也会调用 )");
	}
}
