package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.User;
import com.example.demo.service.StudentService;

@RestController
@RequestMapping(value="studentController")
public class StudentController {
	
	@Autowired
	StudentService studentService;
	
	//@RequestMapping(value = "/createStudent",method = {RequestMethod.POST,RequestMethod.GET})
	@PostMapping(value = "/createStudent")
	public ResponseEntity<?> createStudent(@RequestBody User student) {
		 studentService.createStudent(student);
		return new ResponseEntity("Created student", HttpStatus.OK);
		
	}

}
