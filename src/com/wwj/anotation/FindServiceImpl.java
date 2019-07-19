package com.wwj.anotation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service(value="fs")
public class FindServiceImpl implements  FindService{
	
	
	@Autowired
	private  DandMDao  dandmDao;
	
	




	@Override
	public void FindDandM() {
			System.out.println(dandmDao.getD().size() +	dandmDao.getM().size());
		
	}

}
