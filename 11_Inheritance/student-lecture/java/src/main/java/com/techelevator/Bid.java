package com.techelevator;

public class Bid {

	//Private Members
	private String bidder;
	private int bidAmount;

	//Accessors
	public String getBidder() {
		return bidder;
	}

	public int getBidAmount() {
		return bidAmount;
	}
	
	//Constructor
	public Bid(String bidder, int bidAmount) {
		this.bidder = bidder;
		this.bidAmount = bidAmount;
	}

	
}
