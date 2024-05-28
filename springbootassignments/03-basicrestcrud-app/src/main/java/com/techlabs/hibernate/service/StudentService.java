package com.techlabs.hibernate.service;

import java.util.List;

import com.techlabs.hibernate.entity.Student;

public interface StudentService {
	
	void save(Student student);
	List<Student> getStudents();

}
