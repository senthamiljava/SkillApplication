package com.revature.skillapp.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.revature.skillapp.model.User;

public interface UserRepository extends JpaRepository<User, Integer> {
	public User findByEmailIdAndPassword(String email, String password);
}
