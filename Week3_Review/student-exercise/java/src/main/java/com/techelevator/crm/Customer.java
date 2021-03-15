package com.techelevator.crm;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import com.techelevator.Billable;
import com.techelevator.Person;

public class Customer extends Person implements Billable{
 
	private String phoneNumber;
	private List<String> pets = new ArrayList<String>();
	
	//CTOR1
	public Customer(String firstName, String lastName, String phoneNumber) {
		super(firstName, lastName);
		this.phoneNumber = phoneNumber;
		
	} 
	//CTOR2
	public Customer(String firstName, String lastName) {
		this(firstName, lastName, "");
	}
	 
	public String getphoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	 
	public List<String> getPets(){
		return pets;
	}
	public void setPets(List<String> pets) {
		this.pets = pets;
	}
	
	@Override
	public double getBalanceDue(Map<String, Double> servicesRendered) {
		double balance = 0;
		
		for(Map.Entry<String, Double> service : servicesRendered.entrySet()) {
			
			balance = balance + service.getValue();
			
		}
		
		return balance;
	}
	 
}
