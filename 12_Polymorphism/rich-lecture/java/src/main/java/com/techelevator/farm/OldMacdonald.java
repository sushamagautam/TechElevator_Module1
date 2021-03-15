package com.techelevator.farm;

import java.util.ArrayList;
import java.util.List;

public class OldMacdonald {
	public static void main(String[] args) {

		// Polymorphism through Inheritance
		FarmAnimal[] farmAnimals = new FarmAnimal[] { new Cow(), new Chicken()};

		for (FarmAnimal animal : farmAnimals) {
			String name = animal.getName();
			String sound = animal.getSound();
			System.out.println("Old MacDonald had a farm, ee, ay, ee, ay, oh!");
			System.out.println("And on his farm he had a " + name + ", ee, ay, ee, ay, oh!");
			System.out.println("With a " + sound + " " + sound + " here");
			System.out.println("And a " + sound + " " + sound + " there");
			System.out.println("Here a " + sound + " there a " + sound + " everywhere a " + sound + " " + sound);
			System.out.println();
		}
		
		System.out.println("\n ****** POLYMORPHISM WITH INTERFACES! *********\n");
		
		// Polymorphism using an Interface
		
		List<Singable> singableThings = new ArrayList<>();
		
		singableThings.add(new Cow());
		singableThings.add(new Chicken());
		singableThings.add(new Tractor());
		
		for(Singable thing : singableThings) {
			thing.singAboutMe();
			System.out.println("\n");
		}
		
		List<Sellable> forSaleItems = new ArrayList<>();
		
		forSaleItems.add(new Chicken());
		
		for(Sellable item : forSaleItems) {
			item.sell();
		}
		
		System.out.println("");
		
		/*******************************************************/
		/** BONUS MATERIAL - NOT NECESSARILY JUNIOR LEVEL ... **/
		/*******************************************************/
		/** THIS WILL DEMONSTRATE AN EVEN HIGHER LEVEL OF     **/
		/** ABSTRACTION THAN WHAT WE"VE SEEN HERE. IT IS NOT  **/
		/** APPROPRIATE NOR IS IT NEEDED FOR ANY OF YOUR      **/
		/** ASSIGNMENTS.                                      **/
		/*******************************************************/
		/**           !!FOR DEMO PURPOSES ONLY!!              **/
		/*******************************************************/
		
		System.out.println("/******************************/");
		System.out.println("/******* BONUS MATERIAL *******/");
		System.out.println("/******************************/");
		System.out.println("/* !!FOR DEMO PURPOSES ONLY!! */");
		System.out.println("/******************************/");
		
		System.out.println("");
		
		/****************************************************************************/
		/*** IF EVERYTHING IN JAVA IS ULTIMATELY DERIVED FROM java.lang.Object .. ***/
		/****************************************************************************/
		/***	1) I can treat any class as type Object and place it in an Object ***/
		/***       typed collection                                               ***/
		/***	2) If I place a specific type in a Collection of Object, I need   ***/
		/***	   a way to inspect each item in the collection to see what       ***/
		/***       specific type it is so I can SAFELY call that Specifc Type's   ***/
		/***	   methods. Otherwise a run time or compile time error could occur***/
		/***	3) There is a special operator called instanceof, the instanceof  ***/
		/***	    operator returns a Boolean value to say if A is of type B	  ***/
		/***	4) I can use a conditional statement based on instanceof to 	  ***/
		/***	    safely "type cast" objects and call the cast types methods    ***/
		/****************************************************************************/
		
		List<Object> farmObjects = new ArrayList<>();
		
		farmObjects.add(new Cow());
		farmObjects.add(new Chicken());
		farmObjects.add(new Tractor());
		
		for(Object item : farmObjects) {
			
			if( item instanceof FarmAnimal) {
				System.out.println("One of my animals is a " + ((FarmAnimal)item).getName() + "\n");
			}else {
				System.out.println("THIS IS NOT AN ANIMAL!\n");
			}
				
			if( item instanceof Sellable) {
				((Sellable)item).sell();
			}
			
			if( item instanceof Singable) {
				((Singable)item).singAboutMe();
			}
			
			System.out.println("\n");
		}
				
		
	}
}