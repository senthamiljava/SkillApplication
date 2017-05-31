package com.revature.skillapp.repository;

import java.util.List;


import org.springframework.data.jpa.repository.JpaRepository;

import com.revature.skillapp.model.User;
import com.revature.skillapp.model.UserRating;

public interface UserRatingRepository extends JpaRepository<UserRating, Integer> {
	List<UserRating> findByUser(User u);
}
