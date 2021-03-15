package com.techelevator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class RichLecture {

	private static boolean debugMode = true;
	
	public static void main(String[] args) {
		System.out.println("####################");
		System.out.println("       LISTS");
		System.out.println("####################");

		//SEE THE VERY BOTTOM FOR THE DEBUG MESSAGE FROM STEVEN'S DEBUG PRINT QUESTION
		debugPrint("Lecture Starting");
		
		List<String> names = new ArrayList<String>();
		
		names.add("Bob");
		names.add("Mary");
		names.add("Jen");
		names.add("kory");
		names.add("Kory");
		names.add("Uninvited");
		names.add("mary");
		names.add("Tina");

		System.out.println("####################");
		System.out.println("Lists are ordered");
		System.out.println("####################");
		
		for(int i = 0; i < names.size(); i++) {
			System.out.println(names.get(i));
			
			//The collection may not be altered IN FOR EACH loops, but they can here
			if(names.get(i).equals("Jen")) {
				//BUT if we remove mid-collection within a for loop, the size() is 
				//  re-calculated, decreasing by 1 so the indexer i must be offset by -1
				names.remove(i);
				i = (i==0)?0:i--;
			}
		}

		System.out.println("--- After Removing Jen  ---");
		
		for(int i = 0; i < names.size(); i++) {
			System.out.println(names.get(i));
		}

		System.out.println("####################");
		System.out.println("Lists allow duplicates");
		System.out.println("####################");

		names.add("Jen");
		names.add("Bob");
		
		for(int i = 0; i < names.size(); i++) {
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
		System.out.println("Bob is in (at least) position: " + indexOfBob + " if not more");
		
		//What can I do to remove all Bobs?
		
		while(names.contains("Bob")) {
			names.remove(names.indexOf("Bob"));
		}

		for(String name : names) { 
			System.out.println(name);
		}
		
		System.out.println("####################");
		System.out.println("Lists can be turned into an array");
		System.out.println("####################");

		String[] partyList = names.toArray(new String[0]);
		
		System.out.println("The party guest list array is: ");
		
		for(int i = 0; i < partyList.length; i++) {
			System.out.println(partyList[i]);
		}

		System.out.println("####################");
		System.out.println("Lists can be sorted");
		System.out.println("####################");

		Collections.sort(names); //Sort() modifies the original list, lists are in that sense mutable
		
		for(String name : names) { 
			System.out.println(name);
		}
		
		//What if we wanted natural alpha sort
		System.out.println("Can we fix the ASCII sort dilema??");
		
		for(String name : names) { 
			name = name.toUpperCase();
		}
		
		Collections.sort(names);
		
		
		for(String name : names) { 
			System.out.println(name);
		}
		
		//Why wouldn't the value of each name be changed? --> Collections may not be changed (Re-assigned) while in use by a FOR EACH LOOP
		
//		for(int i = 0; i < names.size(); i++) {
//			names.set(i, names.get(i).toUpperCase());
//		}
//		
//		Collections.sort(names);
//		
//		
//		for(String name : names) { 
//			System.out.println(name);
//		}
		
		
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

		// Read as: For Each String, referred to as 'name', in my List 'Names' do something. 
		//    If the something involves an individual object in the collection I may refer to that instance as 'name'
		for(String name : names) { 
			System.out.println(name);
		}
		
		//Lists have toString() backing methods that give a nice string representation when printed ;)
		System.out.println(names);
		// Arrays do not :(
		System.out.println(partyList);
		
		String strList = names.toString();
		String strArray = partyList.toString();
		
		System.out.println("List backing toString() method: " + strList + "\nArray backing toString() method: " + strArray);

			
	}
	
	public static void debugPrint(String message) {
		if(debugMode) {System.out.println("DEBUG: " + message);}
	}
	
}
