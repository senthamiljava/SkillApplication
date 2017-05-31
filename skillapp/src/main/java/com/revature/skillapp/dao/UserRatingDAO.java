package com.revature.skillapp.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class UserRatingDAO {

	@Autowired
	private JdbcTemplate jdbcTemplate;

	public void addRating(Integer id) {

		String sql = "INSERT INTO user_ratings(user_id,skill_id)(SELECT stu.id ,skill.id FROM users stu,skills skill WHERE stu.id=?)";
		Object[] params = { id };
		int rows = jdbcTemplate.update(sql, params);
		System.out.println("No of rows inserted:" + rows);
	}

	public void addSkill(Integer id) {

		String sql = "INSERT INTO user_ratings(user_id,skill_id)(SELECT stu.id ,skill.id FROM users stu,skills skill WHERE skill.id=?)";
		Object[] params = { id };
		int rows = jdbcTemplate.update(sql, params);
		System.out.println("No of rows inserted:" + rows);
	}
}
