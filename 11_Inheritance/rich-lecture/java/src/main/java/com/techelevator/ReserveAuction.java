package com.techelevator;

/**
 * This class models an auction in which the seller has set a minimum sale price
 *  in advance (the 'reserve' price) and if the final bid does not reach that price
 *  the item remains unsold.
 */
public class ReserveAuction extends Auction {
	
	private Integer reservePrice;
	
	public int getReservePrice() {
		return this.reservePrice;
	}
	
	@Override
	public int getDefaultPrice() {
		
		return this.reservePrice;
	}
	
	public ReserveAuction(String itemForSale, int minimumPrice) {
		super(itemForSale);
		this.reservePrice = minimumPrice;
	}

	/*
	 * This class overrides the default placeBid behavior of the parent Auction class.
	 * If the offeredBid does not meet or exceed the reserve price, the bid
	 * is ignored.
	 */
	
	@Override
	public boolean placeBid(Bid offeredBid) {
		boolean isCurrentWinningBid = false;
		
		//Establish condition before invoking the default super class
		//  bid placement method
		if(offeredBid.getBidAmount() >= reservePrice) {
			
			// Set the override method's bool to the result of the 
			//	Super class method
			isCurrentWinningBid = super.placeBid(offeredBid);
		}
		
		//Return Result
		return isCurrentWinningBid;
	}

	
}
