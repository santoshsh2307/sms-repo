package com.example.demo.serviceimpl;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.User;
import com.example.demo.repository.LogInRepository;
import com.example.demo.service.LoginService;

@Service
public class LoginServiceImpl implements LoginService{

	@Autowired
	LogInRepository logInRepository;
	
	@Override
	public Optional<User> loginUser(String userName, String password) {
		// TODO Auto-generated method stub
		return logInRepository.findByUsernameAndPassword(userName,password);
	}

	@Override
	public Optional<User> sendOtpToMail(String email) {
		return logInRepository.findByEmail(email);
	}

	@Override
	public Optional<User> validate(String email, String otp) {
		// TODO Auto-generated method stub
		return logInRepository.findByEmailAndOtp(email,otp);
	}

	
}
