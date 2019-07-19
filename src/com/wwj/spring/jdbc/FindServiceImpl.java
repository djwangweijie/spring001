package com.wwj.spring.jdbc;

public class FindServiceImpl implements  FindService{
	
	private  DandMDao  dandmDao;
	
	

	public void setDandmDao(DandMDao dandmDao) {
		this.dandmDao = dandmDao;
	}



	@Override
	public void FindDandM() {
			System.out.println(dandmDao.getD().size() +	dandmDao.getM().size());
		
	}

}
