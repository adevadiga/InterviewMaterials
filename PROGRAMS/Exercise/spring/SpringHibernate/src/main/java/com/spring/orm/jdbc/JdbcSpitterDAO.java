package com.spring.orm.jdbc;

import java.util.HashMap;
import java.util.Map;

import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;

import com.spring.orm.jdbc.model.Spitter;

public class JdbcSpitterDAO implements SpitterDao{
	
	NamedParameterJdbcTemplate namedParameterJdbcTemplate;

	public NamedParameterJdbcTemplate getSimpleJdbcTempalte() {
		return namedParameterJdbcTemplate;
	}

	public void setSimpleJdbcTempalte(NamedParameterJdbcTemplate namedParameterJdbcTemplate) {
		this.namedParameterJdbcTemplate = namedParameterJdbcTemplate;
	}
	
	private static final String SQL_INSERT_SPIITER = "INSERT INTO SPIITER (userName, password,fullname) VALUES (:userName,:password,:fullName)";
	public void addSpitter(Spitter spitter){
		Map<String, Object> params = new HashMap<String, Object>();
		params.put("userName", spitter.getUserName());
		params.put("password", spitter.getPassword());
		params.put("fullName", spitter.getName());
		
		namedParameterJdbcTemplate.update(SQL_INSERT_SPIITER, params);
		//spitter.setId(queryForIdentity());
	}
	

}
