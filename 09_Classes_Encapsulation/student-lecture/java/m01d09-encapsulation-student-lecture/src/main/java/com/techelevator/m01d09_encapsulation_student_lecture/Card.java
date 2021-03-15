package com.techelevator.m01d09_encapsulation_student_lecture;

//standard playing card
public class Card {

	//Private members
	private String brand;
	private String design;
	private int suit;  //hearts, clubs, etc.
	private int rank;  //2,3,4,j,k,A, etc.
	private boolean faceUp = false;
	
	//public accessor aka getters and setters
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
	//****Contructor****
	//default constructor
	public Card() {}
	
	//overload constructor
	public Card (int suit, int rank) {
		this.suit = suit;
		this.rank = rank;
	}
	//****methods - Private then public****
	public void flip() {
		faceUp = !faceUp;
	}
	
	public String cardDisplay() {
	
	return cardDisplay(this.faceUp);  //this refactoring is doing the exact same work as below by passing the internal
										// faceUp property to the overloaded cardDisplay below!
										// if(this.faceUp) {
										//	return this.rank + " : " + this.suit;
										//} else
										//{ return this.design; }
	}
	// TODO: raw rank and suit is not very helpful
public String cardDisplay(boolean faceUp) {
	if(faceUp) {
		return Game.getRankName(this.rank) + " of " + Game.getSuitName(this.suit);
	} else {
		return this.design;
	}
}
	
	
}
