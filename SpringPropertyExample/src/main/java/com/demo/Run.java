package com.demo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;


public class Run {
	public static void main(String[] args) {
	
		System.out.println("main method using annotation");
		AbstractApplicationContext con = new AnnotationConfigApplicationContext(ConfigClass.class);// here we create container
		Employees em = (Employees) con.getBean("id1");//first object
		em.setEmp_Name("Gauri");// try to set name.....
		
		System.out.println("First object  \n My Employee is "+em.emp_Name);
		System.out.println("\n\n ******************************");//print
		
		Employees em2 = (Employees) con.getBean("id1");//create second object
		
		System.out.println("Second object  \n  Using Annotation ......");
		System.out.println("My Employee is "+em2.emp_Name);
		System.out.println("\n\n ******************************");
		
		
		
		Employees em3 = (Employees) con.getBean("id2");//create third object
	
		System.out.println("Third  object  \n Using Annotation ......");
		System.out.println("My Employee is "+em3.emp_Name);
		System.out.println("\n\n ******************************");
		/*
		 * if scope is singleton then destroy ,method does not call.
		 * if we don't use register Shutdown hook method...
		 * then destroy method doesnt call........
		 * A register Shutdown Hook ,method available in AbstractApplicationCotext Interface
		 */
	
		con.registerShutdownHook();
		
	}
}
