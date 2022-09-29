package com.practice;

import java.beans.Beans;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class Run {
  public static void main(String[] args) {
	
	System.out.println("main method using annotation");
	ApplicationContext con = new AnnotationConfigApplicationContext(configFile.class);
	Employees em = (Employees) con.getBean("id1");
	em.setEmp_Name("abc");
	
	System.out.println("My Employee is "+em.emp_Name);
	System.out.println("\n\n ******************************");
	
//	Employees em2 = (Employees) con.getBean("id1");
//	
//	System.out.println("Using Annotation ......");
//	System.out.println("My Employee is "+em2.emp_Name);
//	System.out.println("\n\n ******************************");
//	
	
	
//	Employees em3 = (Employees) con.getBean("id2");
//
//	System.out.println("Using Annotation ......");
//	System.out.println("My Employee is "+em3.emp_Name);
//	System.out.println("\n\n ******************************");
//	
	
}
}
