  package com.qspiders.springcorexml.bean;

import java.util.List;

public class Company {
	
	private long id;
	private String name;
	private String location;
	
	
	public void setId(long id) {
		this.id = id;
	}


	public void setName(String name) {
		this.name = name;
	}


	public void setLocation(String location) {
		this.location = location;
	}


	public void setEmployees(List<Employee> employees) {
		this.employees = employees;
	}


	private List<Employee> employees;

}
