package com.techelevator;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class WordSearch {

	public static void main(String[] args) {

		
		Scanner userScanner = new Scanner(System.in);
		System.out.println("What is the file that should be searched?");
		String filePath = userScanner.nextLine();
		
		//initialize file path adn check if it exists
		File inputFile = new File(filePath);
		if(inputFile.exists() ==  false) {
			System.out.println(filePath + " doesn't exist");
			System.exit(1);
		}
		else if(inputFile.isFile() == false) {
			System.out.println(filePath + " is not a file");
			System.exit(1);
		}

		//String wordToSearch = scanner.nextLine();
		System.out.println("What is the search word you are looking for?");
		String userEntersWord = userScanner.nextLine();


		System.out.println("Will this search be case sensitive? [Y]es [N]o");
		String caseMatters = userScanner.nextLine();

		int lineNumber = 0;		//initialize count for line number
		
		if(caseMatters.equalsIgnoreCase("y")) { //if case sensitivity matters
			try(Scanner fileScanner = new Scanner(inputFile)) {

				while(fileScanner.hasNextLine()) {
					String lineOfInput = fileScanner.nextLine();
					String[] fileOutput = lineOfInput.split(" ");
					lineNumber++;

					for(String lineInputs : fileOutput) {
						if(lineInputs.contains(userEntersWord)) {
							System.out.println(lineNumber + ") "+ lineOfInput);
						}
					}
				}
				fileScanner.close();
			}
			catch(FileNotFoundException ex){
				System.out.println("The file doesn't exist.");
			}
		}
		else if (caseMatters.equalsIgnoreCase("n")) {  //if case sensitivity doesn't matter
			try(Scanner fileScanner = new Scanner(inputFile)){

				while(fileScanner.hasNextLine()) {
					String lineInput = fileScanner.nextLine();
					String lineInputToUpper = lineInput.toUpperCase();   // includes both upper & lowercase
					String[] fileOutput = lineInputToUpper.split(" ");
					lineNumber++;

					for(String lineInputs : fileOutput) {
						if(lineInputs.contains(userEntersWord.toUpperCase())) {
							System.out.println(lineNumber + ") " + lineInput);
						}
					}
				}
			}
			catch(FileNotFoundException e) {
				System.out.println("File not found.");
			}
		}

		userScanner.close();
	}

}
