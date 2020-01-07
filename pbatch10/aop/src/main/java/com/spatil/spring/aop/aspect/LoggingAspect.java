package com.spatil.spring.aop.aspect;

import org.aspectj.lang.JoinPoint;

public class LoggingAspect {

	public void logBeforeAdvice(JoinPoint joinPoint) {
		System.out.println("Logging card details....."+joinPoint.getSignature().getName());
		//System.out.println(joinPoint.getTarget());
	}
	
	public void logAfterAdvice() {
		System.out.println("Logging reference after validateCard complete.....");
	}
	
	
}
