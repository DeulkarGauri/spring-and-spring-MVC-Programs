package com.autowire;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Runner {

	public static void main(String[] args) {
		
		System.out.println("****************** This is Runner class **********************");
		
		ApplicationContext context = new ClassPathXmlApplicationContext("Beans.xml");
		
		Planet p1 = (Planet) context.getBean("Earth");

		System.out.println("Planet Name :-------> " + p1.getName());
		
		System.out.println("\n Gravity is : -------> "+p1.getGt().gt);
		
		
		System.out.println("\n ********************* End *********************************");

	}
}
