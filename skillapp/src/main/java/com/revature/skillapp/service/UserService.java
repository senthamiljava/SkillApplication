package com.revature.skillapp.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import com.revature.skillapp.dao.UserRatingDAO;
import com.revature.skillapp.model.User;
import com.revature.skillapp.repository.UserRepository;
import com.revature.skillapp.util.EmailUtil;

@Service
public class UserService {

	@Autowired
	UserRepository userRepository;
	@Autowired
	UserRatingDAO userRatingDAO;
    @Autowired
	private EmailUtil emailUtil;
	
	PasswordEncoder passwordEncoder = new BCryptPasswordEncoder();

	public User login(User user) {
		User u = userRepository.findByEmailId(user.getEmailId());
		boolean isValid = passwordEncoder.matches(user.getPassword(), u.getPassword());
		if (isValid) {
			User us = userRepository.findByEmailIdAndPassword(user.getEmailId(), u.getPassword());
			System.out.println("valid user" + us);
			return us;
		} else
			return null;
	}

	public User save(User user) throws Exception {

		String password = passwordEncoder.encode(user.getPassword());
		User u = new User();
		u.setEmailId(user.getEmailId());
		u.setPassword(password);
		u.setIsActive(user.getIsActive());
		u.setName(user.getName());
		u.setId(user.getId());
		User result = userRepository.save(u);
		if (result != null) {
			userRatingDAO.addRating(result.getId());
			String subject = "Your account has been created";
			String body = "Welcome to Revature ! You can login to your account !";
			emailUtil.send(result.getEmailId(), subject, body);
			return result;
		} else {
			return null;
		}
	}

}
