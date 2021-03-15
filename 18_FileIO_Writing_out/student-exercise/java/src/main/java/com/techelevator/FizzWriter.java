package com.techelevator;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;

public class FizzWriter {

	public static void main(String[] args) throws IOException {

		String result = "";
		for(int i = 1; i <= 300; i++) {
			result = result + fizzWriter(i) + " ";
		}

		//System.out.println(result); ---> check the loop result

		File newFile = new File("FizzBuzz.txt");
		newFile.createNewFile();

		try(PrintWriter writer = new PrintWriter(newFile)) {

			writer.println(result);
		}
		catch(FileNotFoundException e) {
			e.printStackTrace();
		}
		//System.out.println("FizzWriter complete");
	}


	private static String fizzWriter(int number) {
		// TODO Auto-generated method stub

		String numberAsString = new Integer(number).toString();

		if(number % 3 == 0 && number % 5 == 0) {
			return "FizzBuzz";
		}
		else {
			if(numberAsString.contains("3")) {
				if(numberAsString.contains("5")) {
					return "FizzBuzz";
				}

				return "Fizz";
			}

			if(numberAsString.contains("5")) {
				if(numberAsString.contains("3")) {
					return "FizzBuzz";
				}
				return "Buzz";
			}
			else {
				if(number % 3 == 0) {
					return "Fizz";
				}
				if(number % 5 == 0) {
					return "Buzz";
				}

				return numberAsString;
			}
		}
	}

}
