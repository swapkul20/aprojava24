package com.techlabs.hibernate.service;

import java.util.List;

import org.springframework.data.domain.Page;

import com.techlabs.hibernate.entity.Address;
import com.techlabs.hibernate.entity.Course;
import com.techlabs.hibernate.entity.Student;

public interface StudentService {
	
	void addStudent(Student student);
	Page<Student> getStudents(int pageno, int pagesize);
	Address getAddressOfStudent(int rollnumber);
	Student update(int rollnumber,String city);
	List<Course> getCourses(int rollnumber);

}
