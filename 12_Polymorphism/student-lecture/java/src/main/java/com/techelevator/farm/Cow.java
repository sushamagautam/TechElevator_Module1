package com.techelevator.farm;

public class Cow extends FarmAnimal implements Singable {

	public Cow() {
		super("Cow", "moo!");
	}

	@Override
	public void singAboutMe() {
		// TODO Auto-generated method stub
		System.out.println("....whatever..., just milk me");
		System.out.println("With a " + getSound() + " " + getSound() + " here");
		System.out.println("I'm a cow and I just wanna eat graas");
		System.out.println("Here, Watch me chew!");
	
		
	}

}