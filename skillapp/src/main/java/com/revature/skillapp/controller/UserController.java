package com.revature.skillapp.controller;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.revature.skillapp.dao.UserRatingDAO;
import com.revature.skillapp.model.User;
import com.revature.skillapp.repository.UserRepository;

@CrossOrigin
@RestController
@RequestMapping("/users")
public class UserController {

	@Autowired
	UserRepository userRepository;

	@Autowired
	UserRatingDAO userRatingDAO;

	@PostMapping("/login")
	public User login(@RequestBody User user) {
		return userRepository.findByEmailIdAndPassword(user.getEmailId(), user.getPassword());
	}

	@PostMapping
	public User save(@RequestBody User user) {
		User result = userRepository.save(user);
		userRatingDAO.addRating(result.getId());
		return result;
	}
}
