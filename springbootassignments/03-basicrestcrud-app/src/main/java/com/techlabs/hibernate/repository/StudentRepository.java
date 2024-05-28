package com.techlabs.hibernate.repository;

import java.util.List;

import com.techlabs.hibernate.entity.Student;

public interface StudentRepository {
	
	void save(Student student);
	List<Student> getStudents();

}
