package com.hexaware.main.beans;

public class Project {
	
	private Long id;
	private String name;
	private Double credit;
	
	public Project() {
		super();
		
	}
	public Project(Long id, String name, Double credit) {
		super();
		this.id = id;
		this.name = name;
		this.credit = credit;
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
	public Double getCredit() {
		return credit;
	}
	public void setCredit(Double credit) {
		this.credit = credit;
	}
	@Override
	public String toString() {
		return "Project [id=" + id + ", name=" + name + ", credit=" + credit + "]";
	}
	
	
}
