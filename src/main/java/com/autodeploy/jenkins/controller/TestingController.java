package com.autodeploy.jenkins.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestingController {

	@GetMapping("/hello")
	public String helloWorld() {
		String hello = "Hello From Auto Build Jenkins :D";
		
		return hello;	
	}

	@GetMapping("/helloarya")
	public String helloarya() {
		String hello = "Hello Arya Nur Prasetya From Auto Build Jenkins :D";
		return hello;	
	}
}
