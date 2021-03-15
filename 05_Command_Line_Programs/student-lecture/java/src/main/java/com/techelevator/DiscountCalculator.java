package com.techelevator;

import java.util.Scanner;

class DiscountCalculator {

    /**
     * The main method is the start and end of our program
     */
    public static void main(String[] args) {

        Scanner userInput = new Scanner(System.in);

        System.out.println("Welcome to the Discount Calculator");

        // Prompt the user for a discount amount
        // The answer needs to be saved as a double
        System.out.print("Enter the discount amount (w/out percentage): ");

        String discAmountString = userInput.nextLine();
        double discAmountDouble = Double.parseDouble(discAmountString);
        discAmountDouble = discAmountDouble/100;
        
        //you may see above two lines refactored into a single statement as ...
        //double discAmountDouble = Double.parseDouble(userInput.nextLine())/100;
        		
        System.out.println(discAmountString);
        
        // Prompt the user for a series of prices
        System.out.print("Please provide a series of prices (space separated): ");
        
        String userPriceList = userInput.nextLine();
        
        String[] priceArray = userPriceList.split(" ");
        
        for (int i = 0; i < priceArray.length; i++) {
        	//read each individual price as a double
        	double originalPrice = Double.parseDouble(priceArray[i]);
        	//calculate the discount amount as a double to subtract it from the original price
        	
        	double discountValue = originalPrice * discAmountDouble;
        	//calculate the sale price
        	double salePrice = originalPrice - discountValue;
        	
        	System.out.println("Original: " + originalPrice + " Sale Price: " + salePrice);
        	
        }

        
    }

}