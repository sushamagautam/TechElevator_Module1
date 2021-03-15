package com.techelevator.farm;

public abstract class FarmAnimal implements Singable {
	private String name;
	private String sound;
	private boolean isAsleep;
	
	protected String nature = "I am a farm animal";

	public FarmAnimal(String name, String sound) {
		this.name = name;
		this.sound = sound;
	}

	public String getName( ) {
		return name;
	}
	
	//THIS is how FarmAnimal sounds are generated .
	public final String getSound( ) {
		if( isAsleep ){
			return "Zzzzzz"; }
		else {
			return sound;
		}
	}
	
	public void sleep(boolean isAsleep) {
		this.isAsleep = isAsleep;
	}

	protected void feed(String food) {
		System.out.println("Yum! " + food);
	}
	
}