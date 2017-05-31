package com.revature.skillapp.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name = "ratings")
public class Rating {

	@Id
	@GeneratedValue
	@Column(name = "id")
	private Integer id;
	@Column(name = "name")
	private String name;
	@Column(name = "scale")
	private Integer scale;
}
