package com.techelevator;

import java.util.ArrayList;
import java.util.List;

public class Auction {

	//Private Members
	private int defaultPrice = 0;
	private String itemForSale;
	private Bid currentHighBid;
	private List<Bid> allBids;
	
	//Accessors
	public Bid getHighBid() {
		return currentHighBid;
	}

	public List<Bid> getAllBids() {
		return new ArrayList<>(allBids);
	}

	public String getItemForSale() {
		return itemForSale;
	}
	
	public int getDefaultPrice() {
		return this.defaultPrice;
	}

	//CTors
		
	public Auction(String itemForSale) {
		this.itemForSale = itemForSale;
		this.currentHighBid = new Bid("", defaultPrice);
		allBids = new ArrayList<>();
	}

	//Methods
	public boolean placeBid(Bid offeredBid) {
		allBids.add(offeredBid);
		boolean isCurrentWinningBid = false;
		if (offeredBid.getBidAmount() > currentHighBid.getBidAmount()) {
			currentHighBid = offeredBid;
			isCurrentWinningBid = true;
		}
		return isCurrentWinningBid;
	}


}
