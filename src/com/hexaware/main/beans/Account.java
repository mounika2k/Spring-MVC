package com.hexaware.main.beans;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

import org.springframework.stereotype.Component;
import org.springframework.validation.annotation.Validated;

@Component
@Validated
public class Account {
	@NotNull(message="name is required")
	@NotBlank(message="name is required")
	@Pattern(regexp="\\w+",message="name is invalid")//a-zA-Z
	private String name;
	
	@NotNull
	
	//@Pattern(regexp="^([a-zA-Z0-9\\-\\.\\_]+)'+'(\\@)([a-zA-Z0-9\\-\\.]+)'+'(\\.)([a-zA-Z]{2,4})$")
	private String email;
	
	private String pan;
	@NotNull
	//@Pattern(regexp="^([0-9]$")   
	private String contact;
	public Account(String name, String email, String pan, String contact) {
		super();
		this.name = name;
		this.email = email;
		this.pan = pan;
		this.contact = contact;
	}
	public Account() {
		super();
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPan() {
		return pan;
	}
	public void setPan(String pan) {
		this.pan = pan;
	}
	public String getContact() {
		return contact;
	}
	public void setContact(String contact) {
		this.contact = contact;
	}
	@Override
	public String toString() {
		return "Account [name=" + name + ", email=" + email + ", pan=" + pan + ", contact=" + contact + "]";
	}
	
	
}
