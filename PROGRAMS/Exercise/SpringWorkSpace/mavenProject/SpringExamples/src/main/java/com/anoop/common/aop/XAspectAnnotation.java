package com.anoop.common.aop;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;


@Aspect
@Component 
public class XAspectAnnotation {

	public XAspectAnnotation(){
		System.out.println("XAspectAnnotation .......................");
	}
	
	@Before("execution(* com.anoop.common.aop.*.star*())")
    public void getAllAdvice(){
        System.out.println("Service method getter called ha ha ha ");
    }
	
	@Pointcut("execution(* transfer(..))")
	private void applyOldTransfer()
	{
	
	}

}
