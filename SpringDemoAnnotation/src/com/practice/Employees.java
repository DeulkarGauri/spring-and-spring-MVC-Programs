package com.practice;

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
