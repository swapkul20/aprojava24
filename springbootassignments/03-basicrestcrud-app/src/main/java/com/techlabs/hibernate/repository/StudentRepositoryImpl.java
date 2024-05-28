package com.techlabs.hibernate.repository;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.techlabs.hibernate.entity.Student;

import jakarta.persistence.EntityManager;
import jakarta.persistence.TypedQuery;
import jakarta.transaction.Transactional;

@Repository
public class StudentRepositoryImpl implements StudentRepository{

	@Autowired
	private EntityManager manager;
	
	@Override
	@Transactional
	public void save(Student student) {
		
		manager.persist(student);
		System.out.println("Record inserted");
		
	}

	@Override
	public List<Student> getStudents() {
		
		TypedQuery<Student> query=manager.createQuery("select s from Student s",Student.class);
		return query.getResultList();
	}

}
