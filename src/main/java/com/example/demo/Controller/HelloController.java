package com.example.demo.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
	@RequestMapping("/hello")
	public String HelloMsg() {
		return "Hello SpringBoot!";
	}
	@GetMapping("/name")
	public String myName() {
		return "My name is SpringBoot";
	}
	
}
 