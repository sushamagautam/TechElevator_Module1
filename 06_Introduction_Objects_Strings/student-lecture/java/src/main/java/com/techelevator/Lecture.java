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

		String greeting = "Hello World!"; //declared instantiated and initialized the String 'greeting.
		System.out.println(greeting);
		/* create an new instance of String using a literal */

		
		System.out.println();
		System.out.println("******************************");
		System.out.println("****** MEMBER METHODS ******");
		System.out.println("******************************");
		System.out.println();

		System.out.println("charAt(6)");
		System.out.println(greeting.charAt(6));
		
		char first = greeting.charAt(3);
		char second = greeting.charAt(4);
		char third = greeting.charAt(10);
		
		 System.out.println(first + second + third); //--doesn't work because char doesn't work in mathematical
		//so we use process as below:
		
		System.out.print(first);
		System.out.print(second);
		System.out.println(third);
		
		char capw = 87;
		System.out.println(capw);
		
		System.out.println("******** String Contains *********");
		String hello = "Hello World";
		System.out.println(hello.contains("ello"));
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
		
		String whiteSpace = "HI!    " ;
		System.out.println(whiteSpace + "|");
		System.out.println(whiteSpace.trim() + "|");

		System.out.println();
		System.out.println("**********************");
		System.out.println("****** EQUALITY ******");
		System.out.println("**********************");
		System.out.println();

		char[] helloArray = new char[] {'H','e','l','l','o'};
		System.out.println(helloArray);
		String hello1 = new String(helloArray);
		System.out.println(hello1);
		String hello2 = new String(helloArray);
		System.out.println(hello2);
		

		/* Double equals will compare to see if the two variables, hello1 and
		 * hello2 point to the same object in memory. Are they the same object? */
		if (hello1 == hello2) {
			System.out.println("They are equal!");
		} else {
			System.out.println("\n"+ hello1 + " is not equal (== equivalent) to " + hello2);
		}

		String hello3 = hello1;
		if (hello1 == hello3) {
			System.out.println("hello1 is the same reference as hello3");
		}

		/* So, to compare the values of two objects, we need to use the equals method.
		 * Every object type has an equals method */
		System.out.println("\n*******using .equals******");
		if (hello1.equals(hello2)) {
			System.out.println("They are equal!");
		} else {
			System.out.println(hello1 + " is not equal to " + hello2);
		}
		
		String bannerTop = "*********";
		String bannerMiddle = "*   0   *";
		String bannerBottom = "*********";
		
		System.out.println(bannerTop);
		System.out.println(bannerMiddle);
		System.out.println(bannerBottom);
		
		String banner = "********" + "\n*   0   *" + "\n*********";
			System.out.println(banner);
		

	}
}
