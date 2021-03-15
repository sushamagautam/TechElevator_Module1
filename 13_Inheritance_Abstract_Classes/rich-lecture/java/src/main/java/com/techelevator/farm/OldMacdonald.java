package com.techelevator.farm;


import town.*;

public class OldMacdonald {
	public static void main(String[] args) {

		Cow daisy = new Cow();
		Chicken cluck = new Chicken();
		Pig porky = new Pig();
		Cat specialCat = new Cat();
		
		GreenVilleAnimal gvCow = new GreenVilleAnimal("Tom", "Hiya");
		
		daisy.sleep(false);
		cluck.sleep(true);
		porky.sleep(false);
		specialCat.sleep(false);
		
		System.out.println("That fancy GreenVille cow is: " + gvCow.nature);
		
		//Marking FarmAnimal Abstract prevents the instantiation of generic farm animals
		//FarmAnimal xylophoneCube = new FarmAnimal("12 x 12 x 12", "C#");
		
		gvCow.feed("Hay");
		
		
		Singable[] singables =
				new Singable[] {daisy, specialCat, cluck,porky, new Tractor()};
		
		// I COULD if it weren't the wrong type, get a random singable and put it to sleep
		// int sleepyCritterIndex = (int)Math.floor(Math.random() * (double)singables.length);
		
		System.out.println(daisy.nature + "\n");
		
		for (Singable singable : singables) {
			String name = singable.getName();
			String sound = singable.getSound();
			System.out.println("Old MacDonald had a farm, ee, ay, ee, ay, oh!");
			System.out.println("And on his farm he had a " + name
					+ ", ee, ay, ee, ay, oh!");
			System.out.println("With a " + sound + " " + sound + " here");
			System.out.println("And a " + sound + " " + sound + " there");
			System.out.println("Here a " + sound + " there a " + sound
					+ " everywhere a " + sound + " " + sound);
			System.out.println();
		}

		Sellable[] sellables = new Sellable[] {new Cow(), new Pig(), new Egg()};

		for (Sellable sellable : sellables) {
			System.out.println("Step right up and get your " + sellable.getName());
			System.out.println("Only $" + sellable.getPrice());
		}
	}
}