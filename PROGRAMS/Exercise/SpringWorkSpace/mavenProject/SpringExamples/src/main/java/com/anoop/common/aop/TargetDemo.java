package com.anoop.common.aop;

import org.springframework.stereotype.Component;

@Component("targetDemo")
public class TargetDemo {

	private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public String startX(){
		return "ANoop";
	}
	
	
}
