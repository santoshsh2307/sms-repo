package com.example.demo.service;

import java.util.Optional;

import com.example.demo.entity.User;

public interface LoginService {

	Optional<User> loginUser(String userName, String password);

	Optional<User> sendOtpToMail(String email);

	Optional<User> validate(String email, String otp);

}
