package com.techlabs.hibernate.service;

import java.util.List;

import org.springframework.data.domain.Page;

import com.techlabs.hibernate.entity.Student;

public interface StudentService {
	
	void addStudent(Student student);
	Page<Student> getAllStudents(int pageno,int pagesize);

}
