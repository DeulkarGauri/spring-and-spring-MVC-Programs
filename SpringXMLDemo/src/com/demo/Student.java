package com.demo;

public class Student {

	int roll_num;
	String Name;
	
	private void m1() {
		// TODO Auto-generated method stub
		
		System.out.println("this is m1 init method");

	}

	private void m2() {
		// TODO Auto-generated method stub
		
		System.out.println("this is m1 destroy method");

	}

	public int getRoll_num() {
		return roll_num;
	}

	public void setRoll_num(int roll_num) {
		this.roll_num = roll_num;
	}

	public String getName() {
		return Name;
	}

	public void setName(String name) {
		Name = name;
	}

}
