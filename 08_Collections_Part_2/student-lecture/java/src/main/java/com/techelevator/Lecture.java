package com.techelevator;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class Lecture {

	public static void main(String[] args) {

		System.out.println("####################");
		System.out.println("        MAPS");
		System.out.println("####################");
		System.out.println();
		//declaring and initializing a map
		Map<String, String> nameToZipCode = new HashMap<>();
		
		//Adding an itm to a map
		
		nameToZipCode.put("Bob", "19100");
		nameToZipCode.put("Dan", "19101");
		nameToZipCode.put("Terry", "19102");
		
		//Retrieve the value from a map
		System.out.println("****retrieve values from a map manually****\n");
		
		System.out.println("Bob lives in zip: " + nameToZipCode.get("Bob"));
		System.out.println("Dan lives in zip: " + nameToZipCode.get("Dan"));
		System.out.println("Terry lives in zip: " + nameToZipCode.get("Terry"));
		
		//Retrieve values from a map using a loop
		
		System.out.println("\n***retrieve a set of keys using iteration 'for loop'***"); 
		
		Set<String> nameKeys = nameToZipCode.keySet(); //returns a Collection of all the keys in the loop
		for(String name : nameKeys) {
			System.out.println(name + " lives in zip: " + nameToZipCode.get(name));
		}
			
			
		//check to see if a key already exists
			System.out.println("\n*** check to see if a key already exists***");
			System.out.println("Map contains Terry? " + nameToZipCode.containsKey("Terry"));
			System.out.println("Map contains Dan? " + nameToZipCode.containsKey("Dan"));
			
			Boolean jenInList = nameToZipCode.containsKey("Jen");
			
			//Add Jen to the list if she is not there and print it out
			System.out.println("\n***Add Jen to the list if she is not there and print it out again***");
			if(!jenInList) {
				nameToZipCode.put("Jen", "19806");
			}
			
			for(String peopleName : nameKeys) {
				System.out.println(peopleName + " lives in zip " + nameToZipCode.get(peopleName));
			}
			
		
		//Iterate though the key value pairs in the map
			System.out.println("\n***Iterate though the key-value pairs in the map***");
			
			for(Map.Entry<String, String> nameZip : nameToZipCode.entrySet() ) {
				System.out.println(nameZip.getKey() + " lives in " + nameZip.getValue());
			}
		
		//remove an element from the map
			System.out.println("\n****Remove an element from the map****");
			nameToZipCode.remove("Bob");
			
			if(nameToZipCode.containsKey("Bob")) {
				System.out.println("Bob is still here");
			}
			else {
				System.out.println("Bob is gone, he lived in 19100");
			}
		System.out.println("\n*****Map now contains*****");
		
		for(Map.Entry<String, String> nameZip : nameToZipCode.entrySet() ) {
			System.out.println(nameZip.getKey() + " lives in " + nameZip.getValue());
		}
		
		//Let's put Jen back
		nameToZipCode.put("Bob", "19100");
		Scanner userInput = new Scanner(System.in);
		System.out.println("\nEnter names to remove");
		String[] names2Remove = userInput.nextLine().split(" ");
		
		Map<String, String> namesRemoved = new HashMap<>();
		
		for(String name : names2Remove) {
			namesRemoved.put(name, nameToZipCode.get(name));
		}
		System.out.println("Preparing to remove selections");
		
		for(String name : namesRemoved.keySet()) {
			System.out.println("Preparing to remove " + name + " living in " + namesRemoved.get(name));
		}
		for(String name : namesRemoved.keySet()); {
		nameToZipCode.remove(nameKeys);
		}
		System.out.println("\n map nameToZipCode now contains");
		for(Map.Entry<String, String> nameZip : nameToZipCode.entrySet() ) {
			System.out.println(nameZip.getKey() + " lives in " + nameZip.getValue());
		}
		System.out.println("Do you wish to commit this change? (Y/N)");
		String response = userInput.nextLine();
		
		if(response.toUpperCase().equals("N")) {
			
			System.out.println("restoring removed entried to map...");
			
			for(String name : namesRemoved.keySet()) {
				nameToZipCode.put(name, namesRemoved.get(name));
			}
			
			System.out.println("Operation complete, final map is now: ");
			
			System.out.println("\nMap nameToZipCode now contains");
			for(Map.Entry<String, String> nameZip : nameToZipCode.entrySet() ) {
				System.out.println(nameZip.getKey() + " lives in " + nameZip.getValue());
			}
			
			
 		}
		
		
	}

}
