package com.techelevator.farm;

public class Tractor implements Singable{

	@Override
	public String getName() {
		// TODO Auto-generated method stub
		return "Big Green";
	}

	@Override
	public String getSound() {
		// TODO Auto-generated method stub
		return "Vroom";
	}

	@Override
	public void singAboutMe() {
		// TODO Auto-generated method stub
		System.out.println("Big Green tractor!");
		System.out.println("You can ride me all day long");
		System.out.println("I never break down");
		System.out.println("...because I am a " + getName() + "!");
		
	}
	

}
