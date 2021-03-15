package com.techelevator;

public class Application {

    public static void main(String[] args) {

        // Create a new general auction
        System.out.println("Starting a general auction");
        System.out.println("-----------------");

        Auction generalAuction = new Auction("Tech Elevator t-shirt");

        generalAuction.placeBid(new Bid("Josh", 1));
        generalAuction.placeBid(new Bid("Fonz", 23));
        generalAuction.placeBid(new Bid("Rick Astley", 13));
        //....
        //....
        // This might go on until the auction runs out of time or hits a max # of bids
        reportAuctionBids(generalAuction);
        
       
        ReserveAuction hundredDollarHat = new ReserveAuction("TE Awesome Hat", 100);
        
        ReserveAuction.placeBid(new Bid("Josh", 101));
        ReserveAuction.placeBid(new Bid("Fonz", 50));
        ReserveAuction.placeBid(new Bid("Rick Astley", 130));
        
        reportAuctionBids(hundredDollarHat);
        
        BuyNowAuction techElevatorMug = new BuyNowAuction("TE Yeti", 50);
        
        techElevatorMug.placeBid(new Bid("Mikey", 15));
        techElevatorMug.placeBid(new Bid("Jane", 17));
        techElevatorMug.placeBid(new Bid("Fonz", 27));
        techElevatorMug.placeBid(new Bid("Mikey", 70));
        
        
        
        
        
    }      
    private static void reportAuctionBids(Auction auctionToReport) {
    	System.out.println("**** " + auctionToReport.getItemForSale() + " ****");
    	System.out.println("**************************************************");
    	
    	System.out.println("Auction High Bidder is: " + auctionToReport.getHighBid().getBidder());
    	int bidCount = 0;
    	
    	for(Bid auctionBid : auctionToReport.getAllBids()) {
    		bidCount++;
    		System.out.println("Bid #" + bidCount + " is " + auctionBid.getBidder() + " for " + auctionBid.getBidAmount());
    		
    		
    	}
    }
}
