package com.techelevator;

import java.util.Scanner;

public class LinearConvert {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		System.out.println("Please enter the length");
		
		String length = input.nextLine();
		double newLength = Double.parseDouble(length);
		
		System.out.println("Is the measurement in (m)eter, or (f)eet? ");
		
		String mOrF = input.nextLine();
		
		String m = ("m");
		String f = ("f");
		
		if(mOrF.equals(m)) {
			System.out.println(length + "m is "+ (newLength * 3.2808399)+ "f.");
		}
		if(mOrF.equals(f)) {
			System.out.println(length + "f is "+ (newLength * 0.3048)+ "m.");
		}
	}

}
