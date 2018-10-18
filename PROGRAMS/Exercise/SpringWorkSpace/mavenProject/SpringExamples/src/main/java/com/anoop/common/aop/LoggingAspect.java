package com.anoop.common.aop;

import org.aspectj.lang.JoinPoint;

public class LoggingAspect {

	public void logEntry(final JoinPoint joinPoint)
	{
	     log("Entering method " + joinPoint.getSignature().getName() + "...");
	}
	public void logExit(final JoinPoint joinPoint)
	{
		log("Exiting method " + joinPoint.getSignature().getName() + "...");
	}
	public void logExitAfterReturn(final JoinPoint joinPoint)
	{
	      log(  "Exiting method (after return) "
	          + joinPoint.getSignature().getName() + ".");
	}

	
	
	public static void log(final String messageToLog)
    {
	      System.out.println(messageToLog);
	}
}
