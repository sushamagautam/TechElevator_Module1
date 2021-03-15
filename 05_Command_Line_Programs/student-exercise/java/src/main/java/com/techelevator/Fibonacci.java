package com.techelevator;

import java.util.Scanner;

public class Fibonacci {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter the Fibonacci number: ");
		
		int input = sc.nextInt(); //collect user input
		
		if (input < 1) {
			System.out.println("Please enter a valid positive number");		//if a user enters a negative number
		}
		
		int num1 = 0, num2 = 1, sum;        //fibonacci: fn = fn-1 + fn-2 : sum = n1 + n2;
		
		 for(int i=0; i <= input; i++) {
			
			 System.out.print(num1 +" ");	//
			 sum = num1 + num2;
			 if(num2 >= input) {			// '>=' excludes 1 for userInput = 1, '>' includes 0 1 for userInput 1
				 break; }
				num1 = num2;
				num2 = sum;			
		 } 
	}
}
