package com.itp.spring.aop;

public class LoggingAspect {
	
	public void logBeforeMethod() {
		System.out.println("Details are logged before method...");
	}

	public void logAfterMethod() {
		System.out.println("Details are logged after method...");
	}

	
	public void logThrowingMethod(Throwable e) {
		System.out.println("Details are logged throwing exception method...");
	}

}
