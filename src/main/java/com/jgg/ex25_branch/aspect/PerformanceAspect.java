package com.jgg.ex25_branch.aspect;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@Aspect
@Component
public class PerformanceAspect {
	
	private static final org.slf4j.Logger log = LoggerFactory.getLogger(LoggingAspect.class);

	@Around("execution(* com.jgg.ex25_branch.service.*.*(..))")
	public Object measureTime(ProceedingJoinPoint pjp) throws Throwable {
		long start = System.currentTimeMillis();
		Object result = pjp.proceed();
		long end = System.currentTimeMillis();
		
		log.info("((((( 실행 시간: {} ))))) \n ((((( {} )))))", pjp.getSignature(), (end - start));
		return result;
}
}