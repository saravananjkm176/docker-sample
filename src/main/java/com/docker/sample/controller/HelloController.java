package com.docker.sample.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.docker.sample.request.model.Employee;

@RestController
@RequestMapping("/s3/training/")
public class HelloController {
	
	
	@GetMapping(value = "/hello")
	public @ResponseBody String getHelloWorld() {
		return "Hello Saravanan Sambandam";
	}
	
	
	@GetMapping(value="/employee/{name}")
	public @ResponseBody Employee getEmployee(@PathVariable String name) {
		Employee emp = new Employee();
		emp.setName("s saravanan");
		emp.setGender("male");
		emp.setDob("17-06-1976");
		return emp;
	}
}
