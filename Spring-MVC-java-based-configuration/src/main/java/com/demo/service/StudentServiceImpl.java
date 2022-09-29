package com.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.demo.model.Student;
import com.demo.repository.StudentRepository;
@Service
public class StudentServiceImpl implements StudentService{

	@Autowired
	StudentRepository studentRepository;
	public Student addStudent(Student std) {
		// TODO Auto-generated method stub
		return  studentRepository.addStudent(std);
	}

	public Student getStudent(int id) {
		// TODO Auto-generated method stub
		return null;
	}

}
