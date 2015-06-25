package com.ccprestige.resource.profile;

import javax.persistence.Entity;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import org.hibernate.validator.constraints.Email;

import com.ccprestige.common.entity.BaseEntity;
import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
public class Profile extends BaseEntity {

	@Email
	@NotNull
	@Size(max = 255)
	private String email;

	private String password;

	@Size(max = 255)
	@NotNull
	private String firstname;

	@Size(max = 255)
	private String lastname;

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getFirstname() {
		return firstname;
	}

	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}

	public String getLastname() {
		return lastname;
	}

	public void setLastname(String lastname) {
		this.lastname = lastname;
	}

	@JsonIgnore
	public String getName() {
		return String.format("%s %s", getFirstname(), getLastname());
	}

	@Override
	public String getEntityDescription() {
		return getName();
	}

}
