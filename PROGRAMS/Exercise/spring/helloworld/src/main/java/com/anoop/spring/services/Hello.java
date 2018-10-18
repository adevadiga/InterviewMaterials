package com.anoop.spring.services;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Hello {

	public static void main(String[] args){
		
		ApplicationContext applicationContext = new
				ClassPathXmlApplicationContext("applicationContext.xml");
		HelloWorldService helloWorldService = (HelloWorldService) applicationContext.getBean("helloWorldService");
		String m = helloWorldService.getName();
		System.out.println(m);
	}
}
