package com.techlabs.hibernate;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.techlabs.hibernate.dao.StudentDao;
import com.techlabs.hibernate.entity.Student;

@SpringBootApplication
public class Application implements CommandLineRunner {
	
	@Autowired
	private StudentDao studentDao;

	public static void main(String[] args) {
		
		SpringApplication.run(Application.class, args);
	}
	
	@Override
	public void run(String ...args) throws Exception
	{
	
		createStudent(studentDao);
	}
	
	private static void createStudent(StudentDao studentDao)
	{
		Student student=new Student("Niket","Mishra","niket@gmail.com");
	   studentDao.save(student);
	}

}
