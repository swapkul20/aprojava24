package com.techlabs.hibernate.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.techlabs.hibernate.dtos.StudentDto;
import com.techlabs.hibernate.entity.Address;
import com.techlabs.hibernate.entity.Course;
import com.techlabs.hibernate.entity.Student;
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
	
	@PutMapping("/students")
	public ResponseEntity<Student> updateStudentCity(@RequestParam int rollnumber, @RequestParam String city)
	{
		return ResponseEntity.ok(studentService.update(rollnumber, city));
		
	}
	
	@GetMapping("/students")
	public ResponseEntity<List<StudentDto>> getAllStudents(@RequestParam int pageno,@RequestParam int pagesize)
	{
		Page<Student> studentPage=studentService.getStudents(pageno, pagesize);
		List<Student> allStudents=studentPage.getContent();
		List<StudentDto> students=new ArrayList<StudentDto>();
		for(Student student : allStudents)
		{
			students.add(new StudentDto(student.getRollnumber(),student.getFirstname(),student.getLastname(),student.getEmail()));
		}
		return ResponseEntity.ok(students);
	}
	@GetMapping("/students/{rollnumber}/address")
	public ResponseEntity<Address> getAddressofStudent(@PathVariable int rollnumber)
	{
		return ResponseEntity.ok(studentService.getAddressOfStudent(rollnumber));
	}
	
	@GetMapping("/students/{rollnumber}/courses")
	public ResponseEntity<List<Course>> getCoursesOfStudent(@PathVariable int rollnumber)
	{
		return ResponseEntity.ok(studentService.getCourses(rollnumber));
	}

}
