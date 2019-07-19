package com.wwj.spring.jdbc;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

public class DandMDaoImpl  implements  DandMDao{
	
	private  JdbcTemplate  jdbcTemplate;
	

	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}

	@Override
	public List<Dad> getD() {
		// TODO Auto-generated method stub
		return jdbcTemplate.query("select * from dad", new RowMapper<Dad>(){

			@Override
			public Dad mapRow(ResultSet rs, int arg1) throws SQLException {
				// TODO Auto-generated method stub
				Dad d = new Dad();
				d.setDname(rs.getString("dname"));
				return d;
			}
			
		});
		
	}

	@Override
	public List<Mother> getM() {
		// TODO Auto-generated method stub
		return jdbcTemplate.query("select * from mother", new RowMapper<Mother>(){

			@Override
			public Mother mapRow(ResultSet rs, int arg1) throws SQLException {
				// TODO Auto-generated method stub
				Mother m = new Mother();
				m.setMname(rs.getString("mname"));
				return m;
	
			}
			
		});

	}

}
