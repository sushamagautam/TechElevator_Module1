package com.techelevator;

import java.util.ArrayList;
import java.util.List;

public class BankCustomer {
	
	//instance variables
	private String name;
	private String address;
	private String phoneNumber;
	private List<Accountable> accounts = new ArrayList<>();
	
	
	//getters and setters
	public String getName() {
		return name;	
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	
	public String getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	
	public Object[] getAccounts() {
		return accounts.toArray();
	}
	public void addAccount(Accountable newAccount) {
		accounts.add(newAccount);
	}
	
	//#6
	int count = 0;
	public boolean isVip() {
	
		for (Accountable account : accounts) {
			count += account.getBalance();
		}
		if( count >= 25000) {
				return true;
			}
		
		
		return false;
	}
	
	
	}
	
	
