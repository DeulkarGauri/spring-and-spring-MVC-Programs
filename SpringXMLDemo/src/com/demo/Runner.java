package com.demo;

import java.nio.channels.ShutdownChannelGroupException;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
/*  
 * Properties of bean
 * name 
 * scope
 * properties
 * init method
 * destroy method
 * autowired
 * lazyinit method
 * 
 */
 
public class Runner {
public static void main(String[] args) {
	System.out.println("main method ");
	
	ApplicationContext context = new ClassPathXmlApplicationContext("Beans.xml");
	//using bean id 
	Student st1 = (Student) context.getBean("Std_1");
	System.out.println("Roll number :------> "+ st1.roll_num);
	System.out.println("Name :------> "+ st1.Name);
	
	//using classtype
	
	Student st2 = context.getBean(Student.class);
	System.out.println("Roll number :------> "+ st2.roll_num);
	System.out.println("Name :------> "+ st2.Name);
	

}
}
