package com.techlabs.hibernate.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.techlabs.hibernate.entity.Student;
import com.techlabs.hibernate.repository.StudentRepository;

@Service
public class StudentServiceImpl implements StudentService{

	@Autowired
	private StudentRepository studentRepo;
	@Override
	public void save(Student student) {
		studentRepo.save(student);
		
	}

	@Override
	public List<Student> getStudents() {
		
		return studentRepo.getStudents();
	}

}
