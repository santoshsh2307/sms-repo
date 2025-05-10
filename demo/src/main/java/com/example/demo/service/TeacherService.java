package com.example.demo.service;

import org.springframework.http.ResponseEntity;

import com.example.demo.entity.User;

public interface TeacherService {


	User createTeacher(User teacher);

}
