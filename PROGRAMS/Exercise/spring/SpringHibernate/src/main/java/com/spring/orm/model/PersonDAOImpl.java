package com.spring.orm.model;

import java.util.List;

import org.hibernate.SessionFactory;

public class PersonDAOImpl implements PersonDAO {
	
	private SessionFactory sessionFactory;

	public SessionFactory getSessionFactory() {
		return sessionFactory;
	}

	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}

	public void save(Person p) {
		// TODO Auto-generated method stub

	}

	public List<Person> list() {
		// TODO Auto-generated method stub
		return null;
	}

}
