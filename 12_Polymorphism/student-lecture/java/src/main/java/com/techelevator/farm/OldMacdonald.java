package com.techelevator.farm;

import java.util.ArrayList;
import java.util.List;

public class OldMacdonald {
	public static void main(String[] args) {

		//polymorphism through inheritance
		
		FarmAnimal[] farmAnimals = new FarmAnimal[] { new Cow(), new Chicken() };

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
		
		System.out.println("\n******* POLYMORPHISM WITH INTERFACE******\n");
		//polymorphism using an Interface
		
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
		
		//*** BONUS material - not junior level necessarily ***
		System.out.println("\n***bonus material***\n");
		
		List<Object> farmObjects = new ArrayList<>();
		
		farmObjects.add(new Cow());
		farmObjects.add(new Chicken());
		farmObjects.add(new Tractor());
		
		for(Object item : farmObjects) {
			
			if(item instanceof Sellable) {
				((Sellable)item).sell();
			}
			if(item instanceof Singable) {
				((Singable)item).singAboutMe();
			}
		}
		
		
	}
}