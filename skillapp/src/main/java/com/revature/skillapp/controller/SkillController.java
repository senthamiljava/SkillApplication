package com.revature.skillapp.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.revature.skillapp.dao.UserRatingDAO;
import com.revature.skillapp.model.Skill;
import com.revature.skillapp.repository.SkillRepository;

@CrossOrigin
@RestController
@RequestMapping("/skills")
public class SkillController {

	@Autowired
	SkillRepository skillRepository;

	@Autowired
	UserRatingDAO userRatingDAO;

	@GetMapping
	public List<Skill> findAll() {
		return skillRepository.findAll();
	}

	@PostMapping("/add")
	public Skill add(@RequestBody Skill skill) {
		Skill result = skillRepository.save(skill);
		userRatingDAO.addSkill(result.getId());
		return result;
	}
}
