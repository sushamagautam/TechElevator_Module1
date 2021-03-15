package com.techelevator;

import java.util.ArrayList;
import java.util.List;

public class Application {

    public static void main(String[] args) {

    	// Create a new auctions
    	Auction generalAuction = new Auction("Tech Elevator t-shirt");
    	ReserveAuction hundredDollarHat = new ReserveAuction("Reserve: TE Glow-In-The-Dark Hat", 100);
        BuyNowAuction techElevatorMug = new BuyNowAuction("Buy Now! TE Yeti", 50);
        
        
        // Start accepting bids
        System.out.println("Starting auctions... Processing Bids");
        System.out.println("-----------------");

        generalAuction.placeBid(new Bid("Josh", 1));
        generalAuction.placeBid(new Bid("Fonz", 23));
        generalAuction.placeBid(new Bid("Rick Astley", 13));
        //....
        //....
        // This might go on until the auction runs out of time or hits a max # of bids
        
        /** Use the Application.reportAuctionBids method to return the Bid and Auction info ***/
        reportAuctionBids(generalAuction);

        
        hundredDollarHat.placeBid(new Bid("Josh", 101));
        hundredDollarHat.placeBid(new Bid("Fonz", 50));
        hundredDollarHat.placeBid(new Bid("Rick Astley", 130));
        hundredDollarHat.placeBid(new Bid("Fonz", 111));

        /** Use the Application.reportAuctionBids method to return the Bid and Auction info ***/
        reportAuctionBids(hundredDollarHat);
        

        techElevatorMug.placeBid(new Bid("Mikey", 15));
        techElevatorMug.placeBid(new Bid("Jane", 17));
        techElevatorMug.placeBid(new Bid("Mikey", 27));
        techElevatorMug.placeBid(new Bid("Fonz", 70));
        techElevatorMug.placeBid(new Bid("Mikey", 75));
        
        /** Use the Application.reportAuctionBids method to return the Bid and Auction info ***/
        reportAuctionBids(techElevatorMug);
        
        
        System.out.println("\n But wait ... if they are all Types of Auctions, we can...");
        
        
        System.out.println("\n**************************************");
        System.out.println(" Report All Auctions as a collection!");
        System.out.println("**************************************");
        
        
        /*****************************************************************/
        // If they are all Auctions, and an Auction is an object ...
        //   ... what structure could I use to process them as a group???
        /*****************************************************************/
        
        List<Auction> currentAuctions = new ArrayList<>();
        
        currentAuctions.add(generalAuction);
        currentAuctions.add(hundredDollarHat);
        currentAuctions.add(techElevatorMug);
        
        for(Auction auctionToReport : currentAuctions) {
        	reportAuctionBids(auctionToReport);
        }
        
        
    }
    
    /*****************************************************************************************/
    /** The Application.reportAuctionBids method return the Bid and Auction info           ***/
    /*****************************************************************************************/
    /*		1) Notice that it has a parameter of type Auction, but it works for all three    */
    /*         different versions: Auction (the Super Class) and both ReserveAuction and     */
    /*         BuyNowAuction, the Sub Classes.                                               */
    /*      2) This works because the two Sub Classes are Types Of Auctions.			     */
    /*         As Sub Classes they pass the "Is-A" test, they can all be treated as Auctions */
    /*         using the Super Class shared attributes.                                      */
    /*      3) IF any of the Sub Classes define @Overrides for the Super Class methods, those*/
    /*         @Overrides will be used in place of the Super Class definition when the Sub   */
    /*         Class is treat as its Parent Type                                             */
    /*****************************************************************************************/
    
    
    private static void reportAuctionBids(Auction auctionToReport) {
    	
    	System.out.println("\n*** " + auctionToReport.getItemForSale() + " ***");
    	System.out.println("************************************************");
    	System.out.println("Auction Default Price is: " + auctionToReport.getDefaultPrice());
    	System.out.println("Auction High Bidder is:" + auctionToReport.getHighBid().getBidder());
    	
    	 //Set a counter for bids, initialized at 0
        int bidCount = 0;
        
        //For each bid, as auctionBid, print the bidder and the bid amount with the bid number
        for(Bid auctionBid : auctionToReport.getAllBids()) {
        	bidCount++;
        	System.out.println( "Bid #" + bidCount + " is " + auctionBid.getBidder() + 
        			" for " + auctionBid.getBidAmount());
        }
    }
}
