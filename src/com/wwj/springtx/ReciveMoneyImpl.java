package com.wwj.springtx;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("recs")
public class ReciveMoneyImpl  implements  ReciveMoney{
	
	@Autowired
	private  AccountDao  acDao;

	@Override
	public void Recivemoney(int aid, int money) {
		// TODO Auto-generated method stub
		acDao.updateDeleteMoney(aid, money);
	}

}
