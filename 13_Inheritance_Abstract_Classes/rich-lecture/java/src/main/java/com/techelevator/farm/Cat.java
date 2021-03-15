package com.techelevator.farm;

public class Cat extends FarmAnimal{
	
	public Cat() {
		super("Barn Cat", "Meow");
	}
	
	public String getNature() {
		return this.nature;
	}
	
	// The final keyword on the Super class' getSound() method prevents this bad behavior
//	@Override
//	public String getSound() {
//		return "Growleow";
//	}

}
