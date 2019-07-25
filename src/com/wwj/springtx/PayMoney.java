package com.wwj.springtx;
/**
 * 
 * @author Yun
 * 扣款
 */
public interface PayMoney {

	/**
	 * 
	 * @param aid  扣款人id
	 * @param rid   收款人id
	 * @param money 扣款人金额
	 */
	void  paymoney(int aid,int money,int rid);
}

