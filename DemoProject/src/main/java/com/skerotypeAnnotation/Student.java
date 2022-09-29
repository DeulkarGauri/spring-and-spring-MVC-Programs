package com.skerotypeAnnotation;

public class Student {
	private String Student_Name;
	private String city;

	public String getStudent_Name() {
		return Student_Name;
	}

	public void setStudent_Name(String student_Name) {
		Student_Name = student_Name;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	@Override
	public String toString() {
		return "Student [Student_Name=" + Student_Name + ", city=" + city + "]";
	}

}
