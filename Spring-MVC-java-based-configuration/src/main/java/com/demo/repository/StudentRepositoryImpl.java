package com.demo.repository;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.demo.model.Student;

@Repository
public class StudentRepositoryImpl implements StudentRepository {

	@Autowired
	SessionFactory sessionFactory;

	public Student addStudent(Student std) {
		// TODO Auto-generated method stub

		Session session = null;

		try {
			session = sessionFactory.openSession();
			session.beginTransaction();

			Integer id = (Integer) session.save(std);

			Student saved = session.get(Student.class, id);

			session.getTransaction().commit();
			session.close();

			return saved;
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}

	}

	public Student getStudent(int id) {
		// TODO Auto-generated method stub
		return null;
	}

}
