package com.techelevator.m01d09_encapsulation_student_lecture;

public class PlayGame {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Game poker = new Game();
		
		System.out.println("Unshuffled, Raw Deck is ...");
		System.out.println(poker.getGameDeck().deckString());
		
		poker.getGameDeck().Shuffle();
		
		System.out.println("Unshuffled, Raw Deck is ...");
		System.out.println(poker.getGameDeck().deckString());
		
		
		
		
	}

}
