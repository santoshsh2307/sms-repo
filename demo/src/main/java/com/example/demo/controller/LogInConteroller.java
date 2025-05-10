package com.example.demo.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.User;
import com.example.demo.service.LoginService;
import com.example.demo.service.StudentService;
import com.example.demo.util.EmailUtil;
import com.example.demo.util.OptUtilClass;

@RestController
@RequestMapping(value = "loginController")
public class LogInConteroller {

	@Autowired
	LoginService loginService;
	
	@Autowired
	StudentService studentService;
	
	@Autowired
	private EmailUtil emailUtil;
	
	@PostMapping(value = "login")
	public ResponseEntity<?> loginUser(String userName, String password) {
		Optional<User> user = loginService.loginUser(userName,password);
		if (user.isPresent()) {
			return new ResponseEntity<User>(user.get(),HttpStatus.FOUND);
		} else {
			return new ResponseEntity<String>("invalid username orpassword", HttpStatus.NOT_FOUND);
		}
	}
	
	@PostMapping(value = "forgetPassword")
	public ResponseEntity<?> forgetPassword(String email) {
		Optional<User> user = loginService.sendOtpToMail(email);
		
		if (user.isPresent()) {
			Integer otp = OptUtilClass.generateSixDigitNumber();
			user.get().setOtp(otp);
			studentService.createStudent(user.get());
			emailUtil.sendEmail("santoshhadapad416@gmail.com","reset password OTP", otp.toString());
			return new ResponseEntity<User>(user.get(),HttpStatus.FOUND);
		} else {
			return new ResponseEntity<String>("invalid username orpassword", HttpStatus.NOT_FOUND);
		}
	}
	
	@PostMapping(value = "validateAndUpdate")
	public ResponseEntity<?> validateAndUpdate(String email,String otp, String password) {
		Optional<User> user = loginService.validate(email,otp);
		
		if (user.isPresent()) {
			user.get().setPassword(password);
			studentService.createStudent(user.get());
			emailUtil.sendEmail("santoshhadapad416@gmail.com","reset password OTP", otp.toString());
			return new ResponseEntity<User>(user.get(),HttpStatus.FOUND);
		} else {
			return new ResponseEntity<String>("invalid OTP", HttpStatus.NOT_FOUND);
		}
	}
	
	
}
