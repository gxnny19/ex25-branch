package com.jgg.ex25_branch.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Aspect;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@Aspect
@Component
public class ExceptionAspect {
	
	 private static final org.slf4j.Logger log = LoggerFactory.getLogger(LoggingAspect.class);
	 
	@AfterThrowing(pointcut = "execution(* com.skc.ex25_branch.service.*.*(..))", throwing = "excep")
	public void logError(JoinPoint jp, Exception excep) {
		log.info("rrrrr 메서중 오류 발생: {} rrrrr \n rrrrr {} rrrrr", jp.getSignature(), excep.getMessage());
	}
}
