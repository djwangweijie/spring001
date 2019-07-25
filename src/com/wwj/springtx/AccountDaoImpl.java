package com.wwj.springtx;

import javax.annotation.Resource;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository(value="acDao")
public class AccountDaoImpl  implements  AccountDao{

	@Resource
	private  JdbcTemplate  jdbcTemplate;
	
	@Override
	public void updateAddMoney(int aid, int money) {
		// TODO Auto-generated method stub
		jdbcTemplate.update("update t_account set money=money-? where aid=?",money,aid);
	}

	@Override
	public void updateDeleteMoney(int aid, int money) {
		// TODO Auto-generated method stub
		jdbcTemplate.update("pdate t_account set money=money+? where aid=?",money,aid);
	}

}
