package com.techlabs.hibernate.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.techlabs.hibernate.entity.Student;
import com.techlabs.hibernate.error.StudentResponseError;
import com.techlabs.hibernate.exceptions.StudentNotFoundException;
import com.techlabs.hibernate.service.StudentService;

@RestController
@RequestMapping("/")
public class StudentController {
	
	@Autowired
	private StudentService studentService;
	
	@PostMapping("/students")
	public void addStudent(@RequestBody Student student)
	{
		studentService.addStudent(student);
	}
	
	@GetMapping("/students")
	public ResponseEntity<List<Student>> getAllStudents(@RequestParam int pageno,@RequestParam int pagesize)
	{
		Page<Student> studentPage;
		
	        studentPage= studentService.getAllStudents(pageno,pagesize);
		
		
		return ResponseEntity.ok(studentPage.getContent());
	}
	
	

}
