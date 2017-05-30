package com.revature.skillapp.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.revature.skillapp.model.Skill;
import com.revature.skillapp.repository.SkillRepository;

@CrossOrigin
@RestController
@RequestMapping("/skills")
public class SkillController {

	@Autowired
	SkillRepository skillRepository;

	@GetMapping
	public List<Skill> findAll() {
		return skillRepository.findAll();
	}
}
