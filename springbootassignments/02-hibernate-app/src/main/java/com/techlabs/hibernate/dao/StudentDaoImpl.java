package com.techlabs.hibernate.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.techlabs.hibernate.entity.Student;

import jakarta.persistence.EntityManager;
import jakarta.transaction.Transactional;

@Repository
public class StudentDaoImpl implements StudentDao {
	
	@Autowired
	private EntityManager manager;

	@Override
	@Transactional
	public void save(Student student) {
		
		manager.persist(student);
		System.out.println("Record inserted");
	}

}
