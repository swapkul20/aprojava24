package com.techlabs.hibernate.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import com.techlabs.hibernate.entity.Address;
import com.techlabs.hibernate.entity.Course;
import com.techlabs.hibernate.entity.Student;
import com.techlabs.hibernate.repository.StudentRepository;

@Service
public class StudentServiceImpl implements StudentService{

	@Autowired
	private StudentRepository studentRepo;
	@Override
	public void addStudent(Student student) {
		
		studentRepo.save(student);
	}

	@Override
	public Page<Student> getStudents(int pageno, int pagesize) {

        Pageable pageable=PageRequest.of(pageno, pagesize);
        Page<Student> studentPage=studentRepo.findAll(pageable);
		return studentPage;
	}

	@Override
	public Address getAddressOfStudent(int rollnumber) {
		Optional<Student> dbStudent=studentRepo.findById(rollnumber);
		Student student=null;
		Address address=null;
		if(dbStudent.isPresent())
			student=dbStudent.get();
		if(student!=null)
			address=student.getAddress();
			
		return address;
	}

	@Override
	public Student update(int rollnumber, String city) {
		Optional<Student> dbStudent=studentRepo.findById(rollnumber);
		Student student=null;
		Student updatedStudent=null;
		if(dbStudent.isPresent())
			student=dbStudent.get();
		if(student!=null)
		{
			Address address=student.getAddress();
			address.setCity(city);
			student.setAddress(address);
			updatedStudent=studentRepo.save(student);
		}
		return updatedStudent;
	}

	@Override
	public List<Course> getCourses(int rollnumber) {
		Optional<Student> dbStudent=studentRepo.findById(rollnumber);
		Student student=dbStudent.get();
		
		return student.getCourses();
	}

}
