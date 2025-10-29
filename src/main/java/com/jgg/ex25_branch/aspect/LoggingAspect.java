package com.jgg.ex25_branch.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@Aspect
@Component
public class LoggingAspect {
	
	private static final org.slf4j.Logger log = LoggerFactory.getLogger(LoggingAspect.class);

	@Before("execution(* com.jgg.ex25_branch.service.*.*(..))")
	public void logBefore(JoinPoint jp) {
		log.info("MMMMMMMMM 메서드 실행전: {} MMMMMM", jp.getSignature());
	}
	
	@AfterThrowing(pointcut = "execution(* com.jgg.ex25_branch.service.*.*(..))", throwing = "result")
	public void logAfter(JoinPoint jp, Object result) {
		log.info("WWWWW 메서드 실행 성공: {} WWWWW \n WWWWW {} WWWWW", jp.getSignature(), result);
	}
}
