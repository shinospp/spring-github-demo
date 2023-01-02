package com.demo.test.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyController {
	
	//This is hello user end point
	@GetMapping("/hello")
	public String hello() {
		return "Welcome test user";
	}
	
	//This is print end point
	@GetMapping("/print")
	public String print() {
		return "print msg";
	}

}
