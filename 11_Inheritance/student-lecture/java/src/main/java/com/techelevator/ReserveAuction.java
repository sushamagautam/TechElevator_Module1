/**
 * 
 */
package com.techelevator;

/**
 * @author Student
 *
 */
public class ReserveAuction extends Auction {
	
	private Integer reservePrice;
	public ReserveAuction(String itemForSale, int itemForSale) {
		super(itemForSale);
	
		this.reservePrice = reservePrice;
		
	}

	@Override
	public boolean placeBid(Bid offerBid) {
		boolean isCurrentWinningBid = false;
		//establish condition before invoking the default super class bid placement method
		if(offerBid.getBidAmount() >= reservePrice) {
			//Set the override method's bool to the result of the super class method
			isCurrentWinningBid = super.placeBid(offeredBid);
			}
		//return Result
		return isCurrentWinningBid;
	}
}
