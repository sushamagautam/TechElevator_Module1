package com.techelevator.m01d09_encapsulation_student_lecture;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Deck {
	//The one private member is a collection of the cards in the deck
	private List<Card> listOfCards = new ArrayList<>();
	
	//We must rely on external data from the game being played to determine those contents
	
	public Deck(int[] suits, int[] ranks) {
		
		
		
	}
	public Deck(int[] suits, int[] ranks, Card[] additionalCards) {
		
		for (int suit : suits) {
			for(int rank : ranks) {
				listOfCards.add(new Card(suit, rank));
			}
		}
		for(Card cardToAdd : additionalCards) {
			listOfCards.add(cardToAdd);
		}
	}
	public Card dealJustOne() {
		
		if(listOfCards.size() != 0) {
			return listOfCards.remove(0);
		} else {
			return null;
		}
	}
	
	public void Shuffle() {
		Collections.shuffle(listOfCards);
	}
	
	public String deckString() {
		String result = "";
		for(Card card : listOfCards) {
			result += card.cardDisplay(true) + "\n";
		}
		
		return result;
	}
}
