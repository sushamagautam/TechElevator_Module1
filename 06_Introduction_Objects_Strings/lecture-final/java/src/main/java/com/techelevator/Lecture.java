package com.techelevator;

public class Lecture {

	public static void main(String[] args) {

		System.out.println("************************************");
		System.out.println("****** MAKING A STRING OBJECT ******");
		System.out.println("************************************");

		/* The String class gets special treatment in the Java language.  One
		 * example of this is that there is a literal representation of a
		 * String (i.e. characters appearing between two double quotes.  This
		 * is not the case for most classes */
		
		String greeting = "Hello World!"; // Declared, Instantiated, and Initialized the string 'greeting'
		System.out.println(greeting);
				
		/* create an new instance of String using a literal */

		
		System.out.println();
		System.out.println("******************************");
		System.out.println("****** MEMBER METHODS ******");
		System.out.println("******************************");
		System.out.println();

		System.out.println("****** charAt() ******");
		
		System.out.println("charAt(6)");
		
		System.out.println(greeting.charAt(6));
		
		
		System.out.println("*** Chars and concatenation ***");
		
		char first = greeting.charAt(3);
		char second = greeting.charAt(4);
		char third = greeting.charAt(10);
		
		System.out.println(first + second + third); //Hmm
		System.out.println(" --- Whoa! printing first + second + third returns a number! ---*");
		System.out.println("---   That's because Chars have the ASCII Decimal Value underlying \n---     "
				+ "their alpha numeric character. Theredore first + second + third returns \n---     "
				+ "the sum of the decimal quivalent (see ASCII Charts)");

		System.out.println("------------------------------\n Absent the + operator they perform as expected:\n------------------------------");
	
		System.out.print(first);
		System.out.print(second);
		System.out.println(third);
		
		System.out.println("------------------------------\n That also means that a Decimal ASCII Code can generate a character (char myChar = 87;) :\n------------------------------");
		char capW = 87;
		
		System.out.println(capW);

		
		
		System.out.println("****** String Contains ******");
				
		String hello = "Hello World!";
		System.out.println("ello? " + hello.contains("ello"));
		System.out.println("bye? " + hello.contains("bye"));
		
		/* Other commonly used methods:
		 *
		 * endsWith
		 * startsWith
		 * indexOf
		 * lastIndexOf
		 * length
		 * substring
		 * toLowerCase
		 * toUpperCase
		 * trim
		 */

		String whiteSpace = "HI!   ";
		System.out.println(whiteSpace  + "|");
		System.out.println(whiteSpace.trim() + "|");
		
		String emptySpace = "Rich      Seeds";
		
		
		System.out.println();
		System.out.println("**********************");
		System.out.println("****** EQUALITY ******");
		System.out.println("**********************");
		System.out.println();

		char[] helloArray = new char[] {'H','e', 'l', 'l', 'o'};
		System.out.println(helloArray);
		
		String hello1 = new String(helloArray);
		System.out.println(hello1);
		
		String hello2 = new String(helloArray);
		System.out.println(hello2);
		
		
		System.out.println("\n*** Double equals will compare to see if the two variables, hello1 and\r\n" + 
				"*** hello2 point to the same object in memory\n");

		/* Double equals will compare to see if the two variables, hello1 and
		 * hello2 point to the same object in memory. Are they the same object? */
		if (hello1 == hello2) {
			System.out.println("They are equal!");
		} else {
			System.out.println(hello1 + " is not equal (== Equivalent) to " + hello2);
		}

		//String assignment as an object reference assignment
		System.out.println("\n****** String assignment as an object reference assignment ******");
		
		String hello3 = hello1;
		
		if (hello1 == hello3) {
			System.out.println("hello1 is the same reference as hello3");
		}

		/* So, to compare the values of two objects, we need to use the equals method.
		 * Every object type has an equals method */
		
		System.out.println("\n****** Using .equals ******");
		if (hello1.equals(hello2)) {
			System.out.println("They are equal!");
		} else {
			System.out.println(hello1 + " is not equal to " + hello2);
		}
		
		// Extra trick: Using control characters to build banners in one String variable
		
		System.out.println("\n*** Extra trick: Using control characters to build banners in one String variable ***\n");
		
		String bannerTop = "***********";
		String bannerMiddle = "*    O    *";
		String bannerBottom = "***********";
		
		System.out.println(bannerTop);
		System.out.println(bannerMiddle);
		System.out.println(bannerBottom);
		
		String banner = "***********\n*    O    *\n***********";
		
		System.out.println(banner);

	}
}
