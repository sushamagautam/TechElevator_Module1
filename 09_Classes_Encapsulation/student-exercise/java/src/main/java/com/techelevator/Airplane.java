package com.techelevator;

public class Airplane {

	//class data members

	private String planeNumber;
	private int bookedFirstClassSeats;
	private int totalFirstClassSeats;
	private int bookedCoachSeats;
	private int totalCoachSeats;


	//class Constructor
	public Airplane(String planeNumber, int totalFirstClassSeats, int totalCoachSeats) {

		this.planeNumber = planeNumber;
		this.totalFirstClassSeats = totalFirstClassSeats;
		this.totalCoachSeats = totalCoachSeats;

	}


	//class getters and setters

	public String getPlaneNumber() {
		return planeNumber;
	}

	public int getBookedFirstClassSeats() {
		return bookedFirstClassSeats;
	}

	public int getAvailableFirstClassSeats() {
		return totalFirstClassSeats - bookedFirstClassSeats;
	}

	public int getTotalFirstClassSeats() {
		return totalFirstClassSeats;
	}

	public int getBookedCoachSeats() {
		return bookedCoachSeats;
	}

	public int getAvailableCoachSeats() {
		return totalCoachSeats - bookedCoachSeats;
	}

	public int getTotalCoachSeats() {
		return totalCoachSeats;
	}

	// class methods

	public boolean reserveSeats(boolean forFirstClass, int numberOfSeats) {

		if (forFirstClass) {
			if( numberOfSeats > getAvailableFirstClassSeats()) {

				return false;
			}
			bookedFirstClassSeats += numberOfSeats;

		}



		// !forFirstClass
		else {
			if(numberOfSeats > getAvailableCoachSeats()) {
				return false;
			}
			bookedCoachSeats += numberOfSeats;

		}

		return true;

	}
}
