package com.revature.skillapp.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.revature.skillapp.model.UserRegister;

public interface UserRegisterRepository extends JpaRepository<UserRegister, Integer> {

}
