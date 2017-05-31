package com.revature.skillapp.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name = "user_registration")
public class UserRegister {

	@Id
	@GeneratedValue
	@Column(name = "id")
	private Integer id;
	@ManyToOne
	@JoinColumn(name = "user_id")
	private User user;
	@Column(name = "activation_code")
	private Integer activstionCode;
}
