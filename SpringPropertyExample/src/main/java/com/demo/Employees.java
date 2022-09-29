package com.demo;

/**
 * * properties of bean id name scope properties init meyhod destroy method
 * Autowire lazyinit
 * 
 * 
 * from this we used mostly used name
 * 
 * 
 * 1. scope ----> In Scope there are two fields
 * 
 * a. singleton scope-----> * By default singleton scope is available * it will
 * create only one bean 
 * 
 * b. prototype scope-----> * It will create multiple beans
 * for every object
 * 
 * 2. init method-----------> * 
 * 
 **/
public class Employees {
	String emp_Name;
	int id;

	public String getEmp_Name() {
		return emp_Name;
	}

	public void setEmp_Name(String emp_Name) {
		this.emp_Name = emp_Name;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public void m1() {
		// TODO Auto-generated method stub
		System.out.println("this is m1 init method");

	}

	public void m2() {
		// TODO Auto-generated method stub
		System.out.println("this destroy method.............");
	}
}
