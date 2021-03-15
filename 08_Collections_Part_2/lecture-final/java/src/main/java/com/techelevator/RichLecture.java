package com.techelevator;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class RichLecture {

	public static void main(String[] args) {

		System.out.println("####################");
		System.out.println("        MAPS");
		System.out.println("####################");
		System.out.println();

		// Declaring and initializing a Map
		
		Map<String, String> nameToZipcode = new HashMap<>();
		
		// Adding an item to a Map
		
		nameToZipcode.put("Bob", "19101");
		nameToZipcode.put("Mary", "19111");
		nameToZipcode.put("Kory", "19122");
		nameToZipcode.put("Tina", "19177");
		nameToZipcode.put("Kate", "19188");
		nameToZipcode.put("Dave", "19199");
		
		
		//Retrieve the values from a map
		System.out.println("\n**** Retrieve values from a map manually ****");
		
		System.out.println("Mary lives in Zip: " + nameToZipcode.get("Mary"));
		System.out.println("Bob lives in Zip: " + nameToZipcode.get("Bob"));
		System.out.println("Kory lives in Zip: " + nameToZipcode.get("Kory"));
		
		//Retrieve values from a map using a loop
		System.out.println("\n**** Retrieve values from a map using a loop ****");
		
		Set<String> nameKeys = nameToZipcode.keySet(); // returns a Collection of all of the keys in the Map
		
		for(String name : nameKeys) {
			System.out.println( name + " lives in Zip: " + nameToZipcode.get(name));
		}
		
		// Check to see if a key already exists
		System.out.println("\n**** Check to see if a key already exists ****");
		System.out.println("Map contains Kory? " + nameToZipcode.containsKey("Kory"));
		System.out.println("Map contains Jen? " + nameToZipcode.containsKey("Jen"));
		
		Boolean jenInList =  nameToZipcode.containsKey("Jen");
		
		
		//Add Jen to the List if she is not there and print it out again
		System.out.println("\n**** Add Jen to the List if she is not there and print it out again ****");
		
		if(!jenInList) {
			nameToZipcode.put("Jen", "19001");
		}
		
		for(String name : nameKeys) {
			System.out.println( name + " lives in Zip: " + nameToZipcode.get(name));
		}
		
		// Iterate through the key-value pairs in the Map
		System.out.println("\n**** Iterate through the key-value pairs in the Map ****");
		
		for(Map.Entry<String, String> nameZip : nameToZipcode.entrySet()) {
			System.out.println( nameZip.getKey() + " lives in " + nameZip.getValue());
		}
		
		//Remove an element from the Map
		System.out.println("\n**** Remove an element from the Map ****");
		
		
		// The remove function
		String associatedValue = nameToZipcode.remove("Jen");
		
		if(nameToZipcode.containsKey("Jen")) {
			System.out.println("Jen is still here");
		}else {
			System.out.println("Jen is gone, she lived at: " + associatedValue);
		}
		
		System.out.println("**** Map now contains ****");

		for(Map.Entry<String, String> nameZip : nameToZipcode.entrySet()) {
			System.out.println( nameZip.getKey() + " lives in " + nameZip.getValue());
		}
		
		//Let's put Jen back
		nameToZipcode.put("Jen", "19001");
		
		// ****************************************************************************************
		// LECTURE CODING CHALLENGE RESULTING FROM MARTIN'S QUESTIONS
		// ****************************************************************************************
		// A practical demonstration of using two maps. One stores the data,the other Map is used to
		//  store deletions and keep them in case the user decides to undo their removal request
		// ****************************************************************************************
		//		1. There are still potential GOTCHAS in this code.
		//			a. If the user does NOT enter names to remove what happens?
		//			b. Can you find any others?
		// ****************************************************************************************
		
		//Declare a scanner named userInput and point it at the System Input Stream
		Scanner userInput = new Scanner(System.in);
		
		//Prompt user to enter the Names they want removed from the nameToZipcode Map
		System.out.print("\nEnter Names to remove separated by a space: ");
		
		//Parse userInput using .split() with a space as the separator value
		String[] names2Remove = userInput.nextLine().split(" ");
		
		//Declare a new Map called namesRemoved, this will store the names from userInput as keys
		// along with their associated values from nameToZipcode in the next step
		Map<String, String> namesRemoved = new HashMap<>();
		
		//For Each name in the String[] namesToRemove, Put(insert) that name into the namesRemoved Map
		// as the Put entry's Key and the associated value from the nameToZipCode Map using name as the
		// nameToZipCode Map's key
		for(String name : names2Remove) {
			namesRemoved.put(name, nameToZipcode.get(name));
		}
		
		//Advise user of system status
		System.out.println("Preparing to remove selections...");
		
		//Using the namesRemoved Map, for each name in the namesRemoved key set, advise the user of
		//  What is about to be deleted
		for(String name : namesRemoved.keySet()) {
			System.out.println( "...Preparing to remove " + name + " living in " + namesRemoved.get(name));
		}
		
		// For each name in the namesRemoved key set, remove that key value from 
		//   the >>> nameToZipcode <<< Map as requested
		for(String name :namesRemoved.keySet()) {
			nameToZipcode.remove(name);
		}
		
		//Report back to the user the current zip of nameToZipCode using a for each loop on its Entry Set
		System.out.println("\nMap nameToZipcode now contains");
		for(Map.Entry<String, String> nameZip : nameToZipcode.entrySet()) {
			System.out.println( nameZip.getKey() + " lives in " + nameZip.getValue());
		}
		
		//Prompt the user to see if they want to commit the change and store their answer 
		//   in a String called response		
		System.out.print("\nDo you wish to commit this change? (Y/N)");
		String response = userInput.nextLine();
		
		//If the user answers (N)o to indicate that they DO NOT actually want those entries
		//  to be removed from nameToZipcode ...
		if(response.toUpperCase().equals("N")) {
			
			System.out.println("Restoring removed entries to Map...");
			
			// ... use a For Each loop to get each name from namesRemoved and use it to PUT
			//   each name and its corresponding value from namesRemoved back into nameToZipCode
			for(String name : namesRemoved.keySet()) {
				nameToZipcode.put(name, namesRemoved.get(name));
			}
			
		}
		
		//Notify the user that all operations are now complete
		System.out.println("--- Operation complete ---");
		
		//Present the user with the final version of the nameToZipCode Map using a For Each loop 
		//   iterating over the nameToZipCode Entry Set 
		System.out.println("\nMap nameToZipcode now contains");
		for(Map.Entry<String, String> nameZip : nameToZipcode.entrySet()) {
			System.out.println( nameZip.getKey() + " lives in " + nameZip.getValue());
		}
	}

}
