package com.techlabs.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {

	  ApplicationContext application= new ClassPathXmlApplicationContext("autoconfig.xml");
	
	  // Harddisk disk=(Harddisk)application.getBean("harddisk","Harddisk.class");
	  
	  Computer computer=(Computer) application.getBean("computer","Computer.class");
	  
	  
	  System.out.println(computer);

	}

}
