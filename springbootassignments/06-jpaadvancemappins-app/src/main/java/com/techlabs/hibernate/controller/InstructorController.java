package com.techlabs.hibernate.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.techlabs.hibernate.entity.Instructor;
import com.techlabs.hibernate.service.InstructorService;

@RestController
@RequestMapping("/app")
public class InstructorController {
	
	@Autowired
	private InstructorService instructorService;
	
	@PostMapping("/instructors")
	public ResponseEntity<Instructor> add(@RequestBody Instructor instructor)
	{
		return ResponseEntity.ok(instructorService.add(instructor));
	}

}
