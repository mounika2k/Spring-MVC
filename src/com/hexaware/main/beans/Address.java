package com.hexaware.main.beans;

public class Address {
	private Long id;
	private String city;
	private Long country;
	public Address() {
		super();
	}
	public Address(Long id, String city, Long country) {
		super();
		this.id = id;
		this.city = city;
		this.country = country;
	}
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public Long getCountry() {
		return country;
	}
	public void setCountry(Long country) {
		this.country = country;
	}
	@Override
	public String toString() {
		return "Address [id=" + id + ", city=" + city + ", country=" + country + "]";
	}
	
}
