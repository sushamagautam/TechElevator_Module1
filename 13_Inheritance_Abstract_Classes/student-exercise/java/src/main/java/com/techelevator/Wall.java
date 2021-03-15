package com.techelevator;

public abstract class Wall {

	//instance variables
	private String name;
	private String color;
	
	public abstract int getArea();
	
	//Constructor
	public Wall(String name, String color, int dimension) {
		this.name = name;
		this.color = color;
	
	}
	
	public Wall(String name, String color) {
		this.name = name;
		this.color = color;
		
	}
	
	//getters
	public String getName() {
		return name;
	}
	
	public String getColor() {
		return color;
	}
	
	public int area() {
		return area();
	}
	

	
	
	
}