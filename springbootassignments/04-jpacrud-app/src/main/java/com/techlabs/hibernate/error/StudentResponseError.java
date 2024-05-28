package com.techlabs.hibernate.error;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

@RequiredArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class StudentResponseError {
	
	private int status;
	private String message;
	private long timestamp;

}
