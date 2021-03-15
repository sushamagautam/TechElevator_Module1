package com.techelevator.farm;

public class Tractor implements Singable {

	@Override
	public String getName() {

		return "Big Green";
	}

	@Override
	public String getSound() {

		return "Vroom";
	}

	@Override
	public void singAboutMe() {
		System.out.println(getName() + "!");
		System.out.println("You can ride me all day long");
		System.out.println("I never break down");
		System.out.println("... because I am " + getName() + "!");
		
	}

	
	
}
