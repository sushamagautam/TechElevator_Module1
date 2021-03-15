package com.techelevator.m01d09_encapsulation_student_lecture;

public class Game {
	//let's do poker because it's the only one Rich has a decent grasp of
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

	private static String[] suitNames = new String[] { "Nil", "Spades", "Diamonds", "Clubs", "Hearts" };
    private static char[] suitSymbols = new char[] { '\u0000', '\u2660', '\u2666', '\u2663', '\u2665' };
    private static String[] rankNames = new String[] { "Joker", "Ace", "Two", "Three", "Four", "Five", "Six", "Seven", 
    													    "Eight", "Nine", "Ten", "Jack", "Queen", "King" };

	//poker deck
	int[] pokerSuits = new int[] { SPADES, DIAMONDS, CLUBS, HEARTS };
	int[] pokerRanks = new int[] { ACE, TWO, THREE, FOUR, FIVE, SIX, SEVEN, EIGHT, NINE, TEN, JACK, QUEEN, KING };

	private Deck gameDeck;
	
	public Deck getGameDeck() {
		return this.gameDeck;
	}
	
	public Game() {
		gameDeck = new Deck(pokerSuits, pokerRanks);
	}
	public static String getSuitName(int suit) {
		return suitNames[suit];
	}
	public char getSuitSymbol(int suit) {
		return suitSymbols[suit];
	}
	public static String getRankName(int rank) {
		return rankNames[rank];
	}
	
	
}
