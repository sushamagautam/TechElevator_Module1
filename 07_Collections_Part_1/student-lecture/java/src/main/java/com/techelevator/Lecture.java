package com.techelevator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Lecture {

	private boolean debug = true;
	
	public static void main(String[] args) {
		System.out.println("####################");
		System.out.println("       LISTS");
		System.out.println("####################");

		List<String> names = new ArrayList<String>();
		names.add("Bob");
		names.add("Mary");
		names.add("Jen");
		names.add("Kory");
		names.add("Tina");
		

		System.out.println("####################");
		System.out.println("Lists are ordered");
		System.out.println("####################");

		for (int i = 0; i < names.size(); i++) {
			System.out.println(names.get(i));
			
			//the collections may not be altered IN FOR EACH LOOPS, but they can here.
			if(names.get(i).equals("Jen")) {
				names.remove(i);
				i = (i==0)?0:i--;
			}
		}
		System.out.println("...After removing Jen...");
		for(int i =0; i < names.size(); i++) {
			System.out.println(names.get(i));
		}
		

		System.out.println("####################");
		System.out.println("Lists allow duplicates");
		System.out.println("####################");

		names.add("Jen");
		names.add("Bob");
		
		for(int i=0; i<names.size(); i++) {
			System.out.println(names.get(i));
		}
		
		System.out.println("####################");
		System.out.println("Lists allow elements to be inserted in the middle");
		System.out.println("####################");

		names.add(2, "Janel");
		
		for(String name : names) {
			System.out.println(name);
		}
		
		System.out.println("####################");
		System.out.println("Lists allow elements to be removed by index");
		System.out.println("####################");

		names.remove(5);
		
		for(String name : names) {
			System.out.println(name);
		}

		System.out.println("####################");
		System.out.println("Find out if something is already in the List");
		System.out.println("####################");

		Boolean bobInList = names.contains("Bob");
		System.out.println("Is Bob still in the list: " + bobInList);
	

		System.out.println("####################");
		System.out.println("Find index of item in List");
		System.out.println("####################");

		int indexOfBob = names.indexOf("Bob");
		System.out.println("\n Bob is in the position: " + indexOfBob + " if not more");
		
		//what can I do to remove all Bobs?
		
		while(names.contains("Bob")) {
			names.remove(names.indexOf("Bob"));
		}
		
		System.out.println("####################");
		System.out.println("Lists can be turned into an array");
		System.out.println("####################");
		
		String[] partyList = names.toArray(new String[0]);
		System.out.println("the party guest list array is: ");
		
		for(int i=0; i< partyList.length; i++) {
			System.out.println(partyList[i]);
		}


		System.out.println("####################");
		System.out.println("Lists can be sorted");
		System.out.println("####################");

		Collections.sort(names);
		
		for (String name : names) {
			System.out.println(name);
		}
		
		//What if we wanted natural alpha sort
		System.out.println("Can we fix the ASCII sort dilema??");
		
		for(String name : names) {
				name = name.toUpperCase();
		}
		
		//Why wouldn't the value of each name be changed?? ------------------------- figure out!!
		
		System.out.println("####################");
		System.out.println("Lists can be reversed too");
		System.out.println("####################");

		Collections.reverse(names);
		
		for(String name : names) {
			System.out.println(name);
		}

		System.out.println("####################");
		System.out.println("       FOREACH");
		System.out.println("####################");
		System.out.println();

		//Read as: For Each String, referred to as name, in my list of Names do something.
	// If that something involves an individual object in the collection I may refer to that instance as 'name'
		
		for(String listout : names) {
			System.out.println(listout);
		}
		System.out.println(names);
	}
}
