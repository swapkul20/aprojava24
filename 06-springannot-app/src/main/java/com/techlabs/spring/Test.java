package com.techlabs.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {

	  ApplicationContext application= new AnnotationConfigApplicationContext(AutoConfig.class);
	
	 
	  
	  Computer computer=application.getBean(Computer.class);
	  
	  
	  System.out.println(computer);

	}

}