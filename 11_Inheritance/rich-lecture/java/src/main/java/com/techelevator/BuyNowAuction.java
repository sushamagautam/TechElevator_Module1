package com.techelevator;

public class BuyNowAuction extends Auction{
	
	private int buyNowPrice;
	
	public int getBuyNowPrice() {
		return this.buyNowPrice;
	}
	
	@Override
	public int getDefaultPrice() {
		
		return this.buyNowPrice;
	}
	
	public BuyNowAuction(String itemForSale, int buyNowPrice) {
		super(itemForSale);
		this.buyNowPrice = buyNowPrice;
		
	}
	
	@Override
	public boolean placeBid(Bid offeredBid) {
		boolean isCurrentWinningBid = false;
		
		//If the auction's High Bid is less than the buy now price, 
		//   allow bidding to continue because the auction is still open
		if (this.getHighBid().getBidAmount() < buyNowPrice) {
			
			// Is the offered Bid >= buy now price
			if(offeredBid.getBidAmount() >= this.buyNowPrice) {
				
				//Be kind, if they offer more than the buy now price, set the bid amount = buy now price
				offeredBid = new Bid(offeredBid.getBidder(), buyNowPrice); 
	
			}

			isCurrentWinningBid = super.placeBid(offeredBid);
		}
		
		return isCurrentWinningBid;
	}
	

}
