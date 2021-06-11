package com.hexaware.main.beans;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

import org.springframework.stereotype.Component;
import org.springframework.validation.annotation.Validated;

@Component
@Validated
public class User {
	
	private Long id;
	@NotNull(message="name is required")
	@NotBlank(message="name is required")
	@Pattern(regexp="\\w+",message="name is invalid")//a-zA-Z
	private String name;
	
	@NotNull(message="username is required")
	@NotBlank(message="username is required")
	private String username;
	
	@Size(min=4,max=10,message="password should be 4-10")
	private String password;
	public User() {
		super();
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	@Override
	public String toString() {
		return "User [id=" + id + ", name=" + name + ", username=" + username + ", password=" + password + "]";
	}
	

}
