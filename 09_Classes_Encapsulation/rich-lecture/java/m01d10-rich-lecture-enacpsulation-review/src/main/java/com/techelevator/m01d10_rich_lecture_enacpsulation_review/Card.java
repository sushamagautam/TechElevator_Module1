package com.techelevator.m01d10_rich_lecture_enacpsulation_review;

//Standard Playing Card
public class Card {
	
	// *** Private Members
	
	//Private members
	private String brand;
	private String design = "Bicycle";
	private int suit; //hearts, clubs, etc.
	private int rank; // 2,3,4,j,k,A etc.
	private boolean faceUp = false;
	
	// *** Gettors and Settors **
	
	//Public Accessors aka Gettors and Settors
	public String getBrand() {
		return this.brand;
	}
	
	public String getDesign() {
		return this.design;
	}

	public int getSuit() {
		return suit;
	}

	public int getRank() {
		return rank;
	}

	public boolean isFaceUp() {
		return faceUp;
	}
	
	// *** Constructor(s) ***
	
	// Default Constructor
	public Card() {}
	
	// Overload Constructor
	public Card(int suit, int rank) {
		this.suit = suit;
		this.rank = rank;
	}
	
	// *** Methods - Added  by access level and name(overload), Private first then public ***
	
	public void flip() {
		faceUp = !faceUp;
	}
	
	public String cardDisplay() {

		return cardDisplay(this.faceUp); 	
		
		// /\/\This\/\/ re-factoring was done because the original code 
		// (commented below) was doing the exact same work as the overload version of the method.
		//	simply by passing internal faceUp property to the overloaded cardDisplay we eliminated duplicate code !
		//		if(this.faceUp) {
		//			return this.rank + " : " + this.suit;
		//		}else
		//		{
		//			return this.design;
		//		}
	}
	
	
	// TODO: DONE! raw rank and suit is not very helpful
	public String cardDisplay(boolean faceUp) {
		if(faceUp) {
			return Game.getRankNames(this.rank) + " of " + Game.getSuitName(this.suit);
		}else
		{
			return this.design;
		}
	}
	
	
}
