package com.techlabs.hibernate.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.techlabs.hibernate.entity.Student;
import com.techlabs.hibernate.service.StudentService;

@RestController
@RequestMapping("/")
public class StudentController {
	
	@Autowired
	private StudentService studentService;
	
	@PostMapping("/students")
	public void saveStudent(@RequestBody Student student)
	{
		studentService.save(student);
		
	}
	
	@GetMapping("/students")
	public List<Student> getAllStudents()
	{
		return studentService.getStudents();
	}

}
