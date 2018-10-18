package com.anoop.common;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.anoop.common.aop.TargetDemo;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	ApplicationContext context = new ClassPathXmlApplicationContext(
				"ApplicationContext.xml");
    	
    	TargetDemo aopDemo = (TargetDemo) context.getBean("targetDemo");
    	aopDemo.setName("Anoop");
    	
    	aopDemo.getName();

    	aopDemo.startX();
    }
}
