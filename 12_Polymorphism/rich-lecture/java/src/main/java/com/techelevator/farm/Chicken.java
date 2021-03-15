package com.techelevator.farm;

import java.math.BigDecimal;

public class Chicken extends FarmAnimal implements Singable, Sellable{

	public Chicken() {
		super("Chicken", "cluck!");
	}

	public void layEgg() {
		System.out.println("Chicken laid an egg!");
	}

	@Override
	public void singAboutMe() {
		// TODO Auto-generated method stub
		System.out.println("I'm a Chicken!");
		System.out.println("I'm a Chicken!");
		System.out.println("Bwak cluck cluck cluck");
		System.out.println("Here's an egg, I'm a chicken");
	}
	
	@Override
	public void sell() {
		 System.out.println("SOLD! One " + getName() + " for " + getPrice());
	}

	@Override
	public BigDecimal getPrice() {
		// TODO Auto-generated method stub
		return BigDecimal.valueOf(1000l, 2);
	}
}