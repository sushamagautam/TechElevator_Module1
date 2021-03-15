package com.techelevator;

public class BuyNowAuction {

	private int buyNowPrice;
	
	public BuyNowAuction(String itemForSale, int buyNowPrice) {
		super(itemForSale);
		this.buyNowPrice = buyNowPrice;
	}
	
	@Override
	
	public placeBid(Bid offeredBid) {
		boolean isCurrentWinningBid = false;
		if(this.getHighBid().getBidAmount() < buyNowPrice) {
			//Is the offered bid >= buy now price
			if(offeredBid.getBidAmount() >= this.buyNowPrice) {
				//be kind, if they offer more than the buy now price, set the bid amount = buy now price
				offeredBid = new Bid(offeredBid.getBidder(), buyNowPrice);
			}
		isCurrentWinningBid = super.placeBid(offeredBid);
		
		}
		return isCurrentWinningBid;
	}
}
