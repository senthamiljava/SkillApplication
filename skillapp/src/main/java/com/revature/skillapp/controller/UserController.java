package com.revature.skillapp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.revature.skillapp.model.User;
import com.revature.skillapp.repository.UserRepository;

@CrossOrigin
@RestController
@RequestMapping("/users")
public class UserController {

	@Autowired
	UserRepository userRepository;

	@PostMapping("/login")
	public User login(@RequestParam("email") String email, @RequestParam("password") String password) {
		return userRepository.findByEmailIdAndPassword(email, password);
	}
	
	@PostMapping
	public User save(@RequestBody User user )
	{
		User result=userRepository.save(user);
	   	return result;
	}
}
