package com.techelevator;

public class Elevator {
	//data members
	private int currentFloor;
	private int numberOfFloors;
	private boolean openDoor;
	
	
	
//Constructor
	
	public Elevator(int totalNumberOfFloors){
		this.numberOfFloors = totalNumberOfFloors;
		currentFloor = 1;
		
	}
	
	
	//setters and getters
	public int getCurrentFloor() {
		return currentFloor;
	}
	
	public int getNumberOfFloors() {
		return numberOfFloors;
	}
	
	public boolean isDoorOpen() {
		return openDoor;
	}
	
	//methods
	
	public void openDoor() {
		openDoor = true;
	}

	public void closeDoor() {
		openDoor = false;
	}
	
	public void goUp(int desiredFloor) {
		if(!openDoor && desiredFloor > currentFloor && desiredFloor <= numberOfFloors) {
			//openDoor;   should i open when we arrive at their floor?
			currentFloor = desiredFloor;
		}
	}
	
	public void goDown(int desiredFloor) {
		if(!openDoor && desiredFloor >= 1 && desiredFloor < currentFloor) {
			currentFloor = desiredFloor;
		
		}
	}
	
	

}