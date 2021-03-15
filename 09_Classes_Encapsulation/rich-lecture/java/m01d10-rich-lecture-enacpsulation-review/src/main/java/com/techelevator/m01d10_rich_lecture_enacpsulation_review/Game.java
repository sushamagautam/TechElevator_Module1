package com.techelevator.m01d10_rich_lecture_enacpsulation_review;

public class Game {

	//Let's do Poker because it's the only one Rich has a decent grasp of..
	
	/** CONSTANTS **/
	/* These public static constants will expose the array index values, by name, for both suits and ranks of cards */
	public static final int NIL = 0;
	public static final int SPADES = 1;
	public static final int DIAMONDS = 2;
	public static final int CLUBS = 3;
	public static final int HEARTS = 4;
	
	public static final int JOKER = 0;
	public static final int ACE = 1;
	public static final int TWO = 2;
	public static final int THREE = 3;
	public static final int FOUR = 4;
	public static final int FIVE = 5;
	public static final int SIX = 6;
	public static final int SEVEN = 7;
	public static final int EIGHT = 8;
	public static final int NINE = 9;
	public static final int TEN = 10;
	public static final int JACK = 11;
	public static final int QUEEN = 12;
	public static final int KING = 13;
	
	/** Private Static Members **/
	//These private statics will expose the String 'friendly names' of the 
	//	constants by aligning a String's index in the array
	// 	to the constants' variable names
	//
	private static String[] suitNames = new String[] { "Nil", "Spades", "Diamonds", "Clubs", "Hearts" };
    private static char[] suitSymbols = new char[] { '\u0000', '\u2660', '\u2666', '\u2663', '\u2665' };
    private static String[] rankNames = new String[] { "Joker", "Ace", "Two", "Three", "Four", "Five", "Six", "Seven", 
    													    "Eight", "Nine", "Ten", "Jack", "Queen", "King" };
		
	// Poker deck. A deck is made up of suits and each suit 
    //	has a series of "ranks" or values
    /** DEFINE POKER SUIT AND RANKS **/
	int[] pokerSuits = new int[] { SPADES, DIAMONDS, CLUBS, HEARTS };
	int[] pokerRanks = new int[] { ACE, TWO, THREE, FOUR, FIVE, SIX, SEVEN, EIGHT, NINE, TEN, JACK, QUEEN, KING };
	
	
	/** Private on-static members **/
	// A Game's private Deck from which to deal and play //
	private Deck gameDeck;
	
	/** Public Gettors **/
	public Deck getGameDeck() {
		return this.gameDeck;
	}
	
	/** CONSTRUCTOR **/
	// Default Game constructor creates a new game deck
	public Game() {
		gameDeck = new Deck(pokerSuits, pokerRanks);
	}
	
	/** METHODS **/
	//** Public Static Methods **//
	
	//Return the Friendly Suit Name based on an integer value 
	//	(from the constants or an individual card)
	public static String getSuitName(int suit) {
		return suitNames[suit];
	}

	//Return the Suit unicode character symbol Name based on an integer value 
	//	(from the constants or an individual card)
	public static char getSuitSymbol(int suit) {
		return suitSymbols[suit];
	}
	
	//Return the Friendly Rank Name based on an integer value 
	//	(from the constants or an individual card)
	public static  String getRankNames(int rank) {
		return rankNames[rank];
	}
	
	
	
	
	
	
}
