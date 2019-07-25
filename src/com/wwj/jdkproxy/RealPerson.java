package com.wwj.jdkproxy;

/**
 * 真实的角色
 * @author Yun
 *
 */
public class RealPerson implements  InterPerson{

	@Override
	public void sayA() {
		// TODO Auto-generated method stub
		System.out.println("sayA");
	}

	@Override
	public void sayB(String s) {
		// TODO Auto-generated method stub
		System.out.println("sayB");
	}

}
