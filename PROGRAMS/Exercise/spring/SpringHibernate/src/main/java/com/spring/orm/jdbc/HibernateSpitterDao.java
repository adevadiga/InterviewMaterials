package com.spring.orm.jdbc;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.spring.orm.jdbc.model.Spitter;

@Repository
public class HibernateSpitterDao implements SpitterDao{
	
	private SessionFactory sessionFactory;
	
	@Autowired
	public HibernateSpitterDao(SessionFactory sessionFactory){
		this.sessionFactory = sessionFactory;
	}
	
	private Session getCurrentSesion(){
		return sessionFactory.getCurrentSession();
	}
	
	public void addSpitter(Spitter spitter){
		getCurrentSesion().save(spitter);
	}
	
	public Spitter getSpitterById(Long id){
		return (Spitter)getCurrentSesion().get(Spitter.class, id);
	}

}
