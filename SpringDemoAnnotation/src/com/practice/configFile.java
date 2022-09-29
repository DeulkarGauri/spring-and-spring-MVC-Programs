package com.practice;

import org.springframework.aop.target.PrototypeTargetSource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration // One of the most important annotations in spring is @Configuration annotation
				// which indicates that the class has @Bean definition methods. So Spring
				// container can process the class and generate Spring Beans to be used in the
				// application.

public class configFile {
	@Bean(name = "id1", initMethod = "m1", destroyMethod = "m2")
	public Employees employees() {
		Employees e1 = new Employees();
		e1.setEmp_Name("abc");
		e1.setId(101);
		return e1;
	}

	@Bean(name = "id2", destroyMethod = "m2")

	public Employees employees1() {
		Employees e1 = new Employees();
		e1.setEmp_Name("fTYTF");
		e1.setId(101);
		return e1;
	}

}
