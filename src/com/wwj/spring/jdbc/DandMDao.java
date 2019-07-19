package com.wwj.spring.jdbc;

import java.util.List;

public interface DandMDao {

	/**
	 * 找爸爸找妈妈
	 */
	List<Dad> getD();
	List<Mother> getM();
}
