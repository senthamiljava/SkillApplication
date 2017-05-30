package com.revature.skillapp.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.revature.skillapp.model.UserRating;
import com.revature.skillapp.repository.UserRatingRepository;

@CrossOrigin
@RestController
@RequestMapping("/userratings")
public class UserRatingController {
	@Autowired
	UserRatingRepository userRatingRepository;

	@GetMapping("/users/{userId}")
	public List<UserRating> findByUser(@PathVariable("id") Integer id) {
		return userRatingRepository.findByUserId(id);
	}

	@PostMapping
	public void save(@RequestBody UserRating userRating) {
		userRatingRepository.save(userRating);
	}

	@PostMapping("/update")
	public void update(@RequestBody UserRating userRating) {
		userRatingRepository.save(userRating);
	}
}