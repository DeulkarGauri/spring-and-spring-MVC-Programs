package com.spring.AOP;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class LoggingAspect {

	//@Before("execution (com.spring.AOP).Amazon.item .* ")
	//@Before("execution(* com.spring.AOP.*.*)")
	@Before("execution(* com.spring.AOP.Amazon.*())")
	void FirstPointCut() {
		
		System.out.println("******************######### welcome to our site ###########******************** ");
	}
	
	
	@After("execution(* com.spring.AOP.Amazon.*())")
	void SecondPointCut() {
		
		System.out.println("******************######### welcome to our site ###########******************** ");
	}
	
	@AfterReturning("execution(* com.spring.AOP.Amazon.*())")
	void ThrirdPointCut() {
		
		System.out.println("******************######### welcome to our site ###########******************** ");
	}
	
	
	@AfterThrowing("execution(* com.spring.AOP.Amazon.*())")
	void fourthPointCut() {
		
		System.out.println("******************######### welcome to our site ###########******************** ");
	}
}
