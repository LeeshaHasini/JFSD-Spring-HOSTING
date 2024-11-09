package com.example.demo;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin
public class Service {
	
	@GetMapping("/")
	public String fun1() {
		return "This is Home Page";
	}
	
	@GetMapping("/welcome/{name}")
	public String fun2(@PathVariable("name") String name) {
		return "welcome " + name;
	}
	
	@PostMapping("/user")
	public String fun3(@RequestBody String user) {
		return "Spring Boot Response " + user;
	}

}
							