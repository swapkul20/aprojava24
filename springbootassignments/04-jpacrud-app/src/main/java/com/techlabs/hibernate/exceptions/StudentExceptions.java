package com.techlabs.hibernate.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import com.techlabs.hibernate.error.StudentResponseError;

@ControllerAdvice
public class StudentExceptions {
	
	@ExceptionHandler
	public ResponseEntity<StudentResponseError> studentExceptionHandler(StudentNotFoundException exception)
	{
		StudentResponseError studentError= new StudentResponseError();
		studentError.setMessage(exception.getMessage());
		studentError.setStatus(HttpStatus.NOT_FOUND.value());
		studentError.setTimestamp(System.currentTimeMillis());
		
		return new ResponseEntity<>(studentError,HttpStatus.NOT_FOUND);
		
	}

}
