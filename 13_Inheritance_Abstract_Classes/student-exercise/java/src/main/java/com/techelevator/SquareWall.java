package com.techelevator;

public class SquareWall extends RectangleWall {

	//instance variables(other than included in rectangleWall)
	private int sideLength;
	
	//CTOR	
	public SquareWall(String name, String color, int sideLength) {
		super(name, color);
		this.sideLength = sideLength;
		
	}
	public int getArea() {
		return sideLength * sideLength;
	}
	
	public String toString() {
		return getName() + " (" + sideLength + "x" + sideLength + ") " + "square";
		}
	
}
