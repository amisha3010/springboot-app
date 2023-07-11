package com.spring.appone.repository.entity;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Users {
	@Id
	String email;
	String firstname;
	String lastname;
	String password;
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getFirstname() {
		return firstname;
	}
	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}
	public Users() {
		
	}
	public Users(String email, String firstname, String lastname, String password) {
		super();
		this.email = email;
		this.firstname = firstname;
		this.lastname = lastname;
		this.password = password;
	}
	@Override
	public String toString() {
		return "Users [email=" + email + ", firstname=" + firstname + ", lastname=" + lastname + ", password="
				+ password + "]";
	}
	public String getLastname() {
		return lastname;
	}
	public void setLastname(String lastname) {
		this.lastname = lastname;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	

}
