package com.techelevator;

public class RectangleWall extends Wall{

	private int length;
	private int height;

	
	//Constructor
	public RectangleWall(String name, String color) {
		super(name, color);
	}
	
	public RectangleWall(String name, String color, int length, int height) {
		super(name, color);
		this.length = length;
		this.height = height;
	}
	
	public int getLength() {
		return length;
	}
	public int getHeight() {
		return height;
	}
	
	public int getArea() {
		return getLength() * getHeight();
	}

	public String toString() {
	return getName() + " (" + length + "x" + height + ") " + "rectangle";
	}




}
