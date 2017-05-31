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

import com.revature.skillapp.model.Rating;
import com.revature.skillapp.model.User;
import com.revature.skillapp.model.UserRating;
import com.revature.skillapp.repository.RatingRepository;
import com.revature.skillapp.repository.UserRatingRepository;
import com.revature.skillapp.repository.UserRepository;

@CrossOrigin
@RestController
@RequestMapping("/userratings")
public class UserRatingController {
	@Autowired
	UserRatingRepository userRatingRepository;

	@Autowired
	RatingRepository ratingRepository;

	@Autowired
	UserRepository userRepository;

	@GetMapping("/users/{userId}")
	public List<UserRating> findByUser(@PathVariable("userId") Integer id) {
		User u = userRepository.findOne(id);
		return userRatingRepository.findByUser(u);
	}

	@PostMapping
	public UserRating save(@RequestBody UserRating userRating) {
		return userRatingRepository.save(userRating);
	}

	@PostMapping("/update/{id}/{scaleid}")
	public UserRating update(@RequestBody UserRating userRating, @PathVariable("id") Integer id,
			@PathVariable("scaleid") Integer ratingId) {
		UserRating rating = new UserRating();
		rating.setId(id);
		rating.setSkill(userRating.getSkill());
		rating.setUser(userRating.getUser());
		Rating r = ratingRepository.findOne(ratingId);
		rating.setRating(r);
		return userRatingRepository.save(userRating);
	}
}