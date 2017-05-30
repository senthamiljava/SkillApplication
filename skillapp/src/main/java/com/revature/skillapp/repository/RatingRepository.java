package com.revature.skillapp.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.revature.skillapp.model.Rating;

public interface RatingRepository extends JpaRepository<Rating, Integer> {

}
