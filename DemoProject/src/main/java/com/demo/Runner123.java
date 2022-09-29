package com.demo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Runner123 {
	
	public static void main(String[] args) {

		System.out.println("here  we starts program ");
		ApplicationContext con = new ClassPathXmlApplicationContext("Beans.xml");
		POJO p1 = (POJO) con.getBean("p1");

		System.out.println("branch name is :- " + p1.getName());

	}

}
