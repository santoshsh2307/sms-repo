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
import com.example.demo.service.TeacherService;

@RestController
@RequestMapping(value="teacherController")
public class TeacherController {
	
	@Autowired
	TeacherService teacherService;
	
	//@RequestMapping(value = "/createStudent",method = {RequestMethod.POST,RequestMethod.GET})
	@PostMapping(value = "/createTeacher")
	public ResponseEntity<?> createTeacher(@RequestBody User teacher) {
		teacherService.createTeacher(teacher);
		return new ResponseEntity("Created teacher", HttpStatus.OK);
		
	}

}
