package com.techelevator;

public class Department {

	//instance variables
	private String name;
	private int departmentId;
	
	//constructor
	public Department(int departmentId, String name) {
		this.departmentId = departmentId;
		this.name = name;
	}
	public int getDepartmentId() {
		return departmentId;
	}
	public void setDepartmentId(int departmentId) {
		this.departmentId = departmentId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	
	
}
