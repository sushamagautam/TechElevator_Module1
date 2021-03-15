package com.techelevator.m01d10_rich_lecture_enacpsulation_review;

public class PlayAGame {

	/** MAIN APPLICATION USED TO PLAY A GAME **/
	public static void main(String[] args) {

		// Create a new instance of a game called poker
		Game poker = new Game();
		
		// *********************************************************
		// Experiment with Deck properties and manipulation
		// by calling the game's deck gettor and that deck's methods
		// *********************************************************
		
		System.out.println("Unshuffled, Raw Deck is ...");
		System.out.println(poker.getGameDeck().deckString());
		
		poker.getGameDeck().Shuffle();
		
		System.out.println("Shuffled, Poker Deck is ...");
		System.out.println(poker.getGameDeck().deckString());
	}

}
