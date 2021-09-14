package com.mauryaApp.pixlrPicApp.api.users.model;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

public class CreateUser {

	@NotNull(message="First name cannot be null")
	@Size(min=2, message="Size cannot be less than 2 characters")
	private String firstName;
	
	@NotNull(message="Last name cannot be null")
	@Size(min=2, message="Size cannot be less than 2 characters")
	private String lastName;
	
	@NotNull(message="Password cannot be null")
	@Size(min=8, max=16, message="Password size cannot be less than 8 characters and greater than 16")
	private String password;
	
	@NotNull(message="Email cannot be null")
	@Email
	private String email;
	
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
}
