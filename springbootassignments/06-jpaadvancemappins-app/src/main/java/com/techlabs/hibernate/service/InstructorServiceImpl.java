package com.techlabs.hibernate.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.techlabs.hibernate.entity.Instructor;
import com.techlabs.hibernate.repository.InstructorRepository;

import lombok.extern.slf4j.Slf4j;

@Service
@Slf4j
public class InstructorServiceImpl implements InstructorService {

	@Autowired
	private InstructorRepository instructorRepo;
	
	private static final Logger logger=LoggerFactory.getLogger(InstructorServiceImpl.class);
	@Override
	public Instructor add(Instructor instructor) {
		
		Instructor dbInstructor=instructorRepo.save(instructor);
		System.out.println("Instructor Addes Successfully");
		logger.info("instructor added successfully:"+instructor.getInstructorId());
		return dbInstructor;
	}

}
