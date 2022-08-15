package com.springboot.Ole.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
//import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;


import com.springboot.Ole.repository.UserRepository;
import com.springboot.Ole.Model.User;
import java.util.List;

@CrossOrigin
@RestController
@RequestMapping("/api/v1/")
public class UserController {
	
	@Autowired
	private UserRepository userRepo;
	
	@PostMapping("/process_register")
	public User saveRegisterData(@RequestBody User user) {
		return userRepo.save(user);
	}
	
	/*
	 * @PostMapping("/register") public String processRegister(User user) {
	 * BCryptPasswordEncoder passwordEncoder = new BCryptPasswordEncoder(); String
	 * encodedPassword = passwordEncoder.encode(user.getPasword());
	 * user.setPasword(encodedPassword);
	 * 
	 * userRepo.save(user);
	 * 
	 * return "Success"; }
	 */
}
