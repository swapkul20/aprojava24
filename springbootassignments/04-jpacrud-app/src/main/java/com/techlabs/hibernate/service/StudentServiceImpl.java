package com.techlabs.hibernate.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import com.techlabs.hibernate.entity.Student;
import com.techlabs.hibernate.exceptions.StudentNotFoundException;
import com.techlabs.hibernate.repository.StudentRepository;

@Service
public class StudentServiceImpl implements StudentService{
	
	@Autowired
	private StudentRepository studentRepo;

	@Override
	public void addStudent(Student student) {
		studentRepo.save(student);
		
	}

//	@Override
//	public List<Student> getAllStudents() {
//		
//		List<Student> students=studentRepo.findAll();
//		return students;
//	}

	@Override
	public Page<Student> getAllStudents(int pageno, int pagesize) {
		
		Pageable pageable=PageRequest.of(pageno, pagesize);
		Page<Student> studentPage=studentRepo.findAll(pageable);
//		System.out.println(studentPage.getNumber());
//		System.out.println(studentPage.getNumberOfElements());
		if(studentPage.getNumberOfElements()==0)
			throw new StudentNotFoundException();
		return studentPage;
	}

}
