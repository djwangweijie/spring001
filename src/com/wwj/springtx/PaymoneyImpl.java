package com.wwj.springtx;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

@Service("pays")
public class PaymoneyImpl  implements  PayMoney{
	
	@Autowired
	private  AccountDao  acDao;
	
	@Autowired
	private  ReciveMoney  recs;

	@Override
	@Transactional(propagation=Propagation.REQUIRED,isolation=Isolation.REPEATABLE_READ,timeout=-1)
	public void paymoney(int aid, int money,int rid) {
		acDao.updateAddMoney(aid, money);
		//构成了事务的传播性
		recs.Recivemoney(rid, money);
	}

}
