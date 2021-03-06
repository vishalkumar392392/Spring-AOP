package com.vishal.spring.aop.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Configuration;

@Configuration
@Aspect
public class BeforeAspect {

	private Logger logger = LoggerFactory.getLogger(this.getClass());

	@Before("execution(* com.vishal.spring.aop.bussiness.*.*(..))")
	public void before(JoinPoint joinPoint) {

		logger.info("Intercepted Method calls -{}", joinPoint);

	}

//	@Before("com.vishal.spring.aop.aspect.CommonJoinPointConfig.dataLayerExecution()")
//	public void before(JoinPoint joinPoint) {
//		
//		logger.info("Intercepted Method calls -{}",joinPoint);
//		
//	}
}
