package com.wwj.model;
/**
 * 
 * @author wwj
 *
 */
public class User {

	public void invoke(){
		System.out.println("普通方法只能被对象调用");
	}
	
	public void init(){
		System.out.println("生的时候");
	}
	public void destory(){
		System.out.println("死的时候");
	}
}
