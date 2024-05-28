package com.techlabs.hibernate.exceptions;

public class StudentNotFoundException extends RuntimeException{
	
	public String getMessage()
	{
		return "Student Not Found";
	}

}
