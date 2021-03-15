package com.techelevator.m01d10_rich_lecture_enacpsulation_review;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Deck {
	
	// The one private member is a collection of the cards in the deck
	private List<Card> listOfCards = new ArrayList<>();
	
	// We must rely on external data from them Game being played to determine the contents of the deck
	
	/*** CONSTRUCTORS ***/
	public Deck(int[] suits, int[] ranks) {
		
		this(suits, ranks, new Card[] {});
		
	}
	
	// Overload Constructor that allows additional cards to be added to a deck
	public Deck(int[] suits, int[] ranks, Card[] additionalCards) {
		
		for(int suit : suits) {
			for(int rank : ranks) {
				listOfCards.add(new Card(suit, rank));
			}
		}
		
		for(Card cardToAdd : additionalCards) {
			listOfCards.add(cardToAdd);
		}
		
	}
	
	//Method to deal a card from the deck
	public Card dealJustOne() {
		
		if(listOfCards.size() != 0) {
			return listOfCards.remove(0);
		}else {
			return null;
		}
	
	}
	
	//Method to shuffle the deck
	public void Shuffle() {
		
		Collections.shuffle(listOfCards);
		
	}
	
	//Method to return a list of all cards currently in the deck
	public String deckString() {
		String result = "";
		for(Card card : listOfCards) {
			result += card.cardDisplay(true) + "\n";
		}
		return result;
	}
	
	
}
