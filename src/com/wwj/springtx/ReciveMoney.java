package com.wwj.springtx;
/**
 * 收款
 * @author Yun
 *
 */
public interface ReciveMoney {
    /**
     * 
     * @param aid  接收人id
     * @param money 接收人金额
     */
	void Recivemoney(int aid,int money);
}
