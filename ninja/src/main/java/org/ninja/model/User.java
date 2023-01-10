package org.ninja.model;

import jakarta.persistence.*;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter

@Entity
@Table(name="ninja_user")
public class User {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String firstname;
	private String middlename;
	private String lastname;
	private String email;
	private Integer mobile;
	private String country;
	private String password;

	protected User() {
	}

	public User(String firstname, String middlename, String lastname, String email, Integer mobile, String country,
			String password) {
		this.firstname = firstname;
		this.middlename = middlename;
		this.lastname = lastname;
		this.email = email;
		this.mobile = mobile;
		this.country = country;
		this.password = password;
	}

	@Override
	public String toString() {
		return "User [id=" + id + ", firstname=" + firstname + ", middlename=" + middlename + ", lastname=" + lastname
				+ ", email=" + email + ", mobile=" + mobile + ", country=" + country + ", password=" + password + "]";
	}

}
