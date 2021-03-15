package com.techelevator;

public class FruitTree {

	//| typeOfFruit | string | X | | The type of fruit on the tree. | | 
	//piecesOfFruitLeft | int | X | | The number of remaining fruit pieces on the tree.
	
	//class Data Members
	String typeOfFruit;
	int piecesOfFruitLeft;
	
	//constructor: Create a constructor for this class that accepts two parameters: String typeOfFruit and
	//int startingPiecesOfFruit. Use these parameters to set the instance variables of the class.
	
	public FruitTree(String typeOfFruit, int startingPiecesOfFruit) {
		this.typeOfFruit = typeOfFruit;
		this.piecesOfFruitLeft = startingPiecesOfFruit;
	}
	
	//getters and setters
	
	public String getTypeOfFruit() {
		return typeOfFruit;
	}
	public int getPiecesOfFruitLeft() {
		return piecesOfFruitLeft;
	}
	
	//methods: Create a method called pickFruit that accepts an int called numberOfPiecesToRemove and returns a boolean.
	//1) If there are enough pieces left on the tree, it "picks" the fruit and updates piecesOfFruitLeft by subtracting 
	//numberOfPiecesToRemove from it. 2) The method returns true if there were enough pieces left to pick. It returns 
	//false if no fruit was picked—that is, piecesOfFruitLeft was less than numberOfPiecesToRemove.

	public boolean pickFruit(int numberOfPiecesToRemove) {
		if (piecesOfFruitLeft >= numberOfPiecesToRemove) {
			piecesOfFruitLeft -= numberOfPiecesToRemove;
			return true;
		}
			return false;
	}
	
	
	
}
