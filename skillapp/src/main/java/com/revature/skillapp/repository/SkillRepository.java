package com.revature.skillapp.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.revature.skillapp.model.Skill;

public interface SkillRepository extends JpaRepository<Skill,Integer> {

}
