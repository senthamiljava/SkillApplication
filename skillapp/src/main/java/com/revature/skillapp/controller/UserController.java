package com.revature.skillapp.controller;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.revature.skillapp.model.User;
import com.revature.skillapp.service.UserService;

@CrossOrigin
@RestController
@RequestMapping("/users")
public class UserController {

	@Autowired
	UserService userService;

	@PostMapping("/login")
	public User login(@RequestBody User user) {
		return userService.login(user);
	}

	@PostMapping
	public User save(@RequestBody User user) throws Exception {
		return userService.save(user);
	}
}
