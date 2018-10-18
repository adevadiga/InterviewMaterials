package com.anoop.spring.services;

public class HelloWorldService {
	
	private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public String sayHello(){
		return name;
	}

}
