package com.revature.skillapp.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.revature.skillapp.model.Rating;
import com.revature.skillapp.repository.RatingRepository;

@CrossOrigin
@RestController
@RequestMapping("/ratings")
public class RatingController {

	@Autowired
	RatingRepository ratingRepository;

	@GetMapping
	public List<Rating> findAll() {
		return ratingRepository.findAll();
	}
}
