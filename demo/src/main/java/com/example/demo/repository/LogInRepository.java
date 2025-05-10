package com.example.demo.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.entity.User;

@Repository
public interface LogInRepository  extends JpaRepository<User, Long>{

	Optional<User> findByUsernameAndPassword(String userName, String password);

	Optional<User> findByEmail(String email);

	Optional<User> findByEmailAndOtp(String email, String otp);

}
