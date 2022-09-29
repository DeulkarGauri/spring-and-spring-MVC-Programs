package com.demo.repository;

import com.demo.model.Student;

public interface StudentRepository {
	
	public Student addStudent(Student std);

	public Student getStudent(int id);
}
