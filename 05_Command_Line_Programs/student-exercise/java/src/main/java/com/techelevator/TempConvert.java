package com.techelevator;

import java.util.Scanner;

public class TempConvert {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Please enter the temperature: "); //user input temp
		
		String originalTemp = input.nextLine();
		double oriTemp = Double.parseDouble(originalTemp);
		
		System.out.print("Is the temperature in (C)elcius, or (F)arenheit? ");
		
		String fOrC = input.nextLine();
		
		String C ="C";
		String F = "F";
		
		if (fOrC.equals(F)) {
			System.out.println(originalTemp + "F is " + ((oriTemp - 32)/ 1.8) + "C.");
		}
		else if (fOrC.equals(C)) {
			System.out.println(originalTemp + "C is " + ((oriTemp * 1.8) + 32) + "F.");
		}
			
	}
}