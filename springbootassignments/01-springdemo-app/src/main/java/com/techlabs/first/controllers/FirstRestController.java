package com.techlabs.first.controllers;

import java.util.Date;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FirstRestController {
	
	@GetMapping("/sayhello")
	public String sayHello()
	{
		return "First Rest Controller Request";
	}
	
	@GetMapping("/date")
	public String todaysDate()
	{
		return (new Date()).toString();
	}
	
	@PostMapping("/date")
	public String todayDate()
	{
		return (new Date()).toString()+"hi";
	}

}
