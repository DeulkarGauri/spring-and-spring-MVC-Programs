package com.spring.AOP;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Amazon_Runner {

	
	public static void main(String[] args) {
		System.out.println("************** Welcome to Amazon *********************");
		
		ApplicationContext context = new AnnotationConfigApplicationContext(annotation_config.class);
		context.getBean(Amazon.class).item();
		context.getBean(Amazon.class).selectedItemList();
		context.getBean( Amazon_Cart.class).cart_item_List();
		context.getBean( Amazon_Cart.class).payment();
		
		
	}
}
