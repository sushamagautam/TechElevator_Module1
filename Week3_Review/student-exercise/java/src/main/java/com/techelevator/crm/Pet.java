package com.techelevator.crm;

import java.util.ArrayList;
import java.util.List;

public class Pet {
	
	//instance variables
	private String name;
	private String species;
	private List<String> vaccinations = new ArrayList<>();
	
	//CTOR
	public Pet(String name, String species) {
		this.name = name;
		this.species = species;
		this.vaccinations = new ArrayList<>();
	}
	   
	 
	//getters and setters
	public String getName() {
		return name;
	}  

	public void setName(String name) {
		this.name = name;
	}

	public String getSpecies() {
		return species;
	}
	public void setSpecies(String species) {
		this.species = species;
	}
	 
	public List<String> getVaccinations(){
		return vaccinations;
	}
	public void setVaccinations(List<String> vaccinations) {
		this.vaccinations = vaccinations;
	} 
	//method
	public String listVaccinations() {
	
		String listVaccinations = String.join(", ", this.getVaccinations());
		return listVaccinations;
	
	}
 
}
