package com.spring.orm.service;

import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.spring.orm.jdbc.model.Spitter;

@Transactional(propagation=Propagation.SUPPORTS, readOnly=true)
public class SpitterServiceImpl implements SpitterService {

	@Transactional(propagation=Propagation.REQUIRED, readOnly=false)
	public void addSpitter(Spitter spitter){
		
	}
}
