package org.ninja.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter

@Entity
// @Table(name="misbah_user")
public class User {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	private String firstname;
	private String middlename;
	private String lastname;
	private String email;
	private String mobile;
	private String country;
	private String password;

	protected User() {
	}

}
