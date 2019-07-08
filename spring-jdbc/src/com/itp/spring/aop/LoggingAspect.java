package com.itp.spring.aop;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;

@Aspect
public class LoggingAspect {
	
	@Pointcut("execution(* com.itp.spring.dao.UserDaoImpl.*(..))")
	public void pcForAllUsers() {
	}
	
	@Before(value = "pcForAllUsers()")
	public void logBeforeMethod() {
		System.out.println("Details are logged before method...");
	}

	@After(value = "pcForAllUsers()")
	public void logAfterMethod() {
		System.out.println("Details are logged after method...");
	}

	
	public void logThrowingMethod(Throwable e) {
		System.out.println("Details are logged throwing exception method...");
	}

}
