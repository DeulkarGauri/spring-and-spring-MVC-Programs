package com.demo;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Scope;



public class ConfigClass {
	@Bean(name = "id1", initMethod = "m1", destroyMethod = "m2")
	@Scope("singleton")
	public Employees employees() {
		Employees e1 = new Employees();
		e1.setEmp_Name("abc");
		e1.setId(101);
		return e1;
	}

	@Bean(name = "id2", initMethod = "m1", destroyMethod = "m2"  )
	@Scope("singleton")
	public Employees employees1() {
		Employees e1 = new Employees();
		e1.setEmp_Name("bhavana");
		e1.setId(101);
		return e1;
	}
}
