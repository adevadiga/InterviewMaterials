package com.spring.orm.model;

import java.util.List;

public interface PersonDAO {

	 public void save(Person p);
     
	 public List<Person> list();
}
