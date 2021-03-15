package com.techelevator;

import java.util.Scanner;

public class DecimalToBinary {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Please enter a series of decimal values separated by spaces: ");
		//receives an input from user and stores the string in an array
		
		String input = sc.nextLine();
		String[] userInput = input.split(" "); //store string split into an array
		
	//	System.out.println("you entered: " + input); //testing input
		
		
		// for loop to store remainder in string [] binary
		//
		
		for (int i=0; i < userInput.length; i++) {
			int decimalValue = Integer.parseInt(userInput[i]);
			String binaryString = new String("");
			
			while (decimalValue > 0) {
				binaryString = (decimalValue % 2) + binaryString;
				decimalValue = decimalValue/2;
				
				}
			
			System.out.println(userInput[i] + " is " + binaryString + " in binary");
		}
		
		/* int num = sc.nextInt();             
		
		int[] rem = new int[100];
		int i=0;
		
		
		while (num > 0) {
			rem[i] = num % 2;
			num = num/2;
			i++;
		}
		// print
		System.out.print("binary values are: ");
		
		for (int j = i-1; j >= 0; j--) {
			System.out.print(rem[j]); 
		} 
		System.out.println(); */
	} 
}
