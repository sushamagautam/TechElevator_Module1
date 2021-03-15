package com.techelevator.crm;

import java.util.HashMap;
import java.util.Map;

import org.junit.Assert;
import org.junit.Test;

import org.junit.*;;

public class CustomerTest  {

	Customer man = new Customer("Bob", "Mosley", "215456");
	
	@Test
	public void testCustomer() {
		Map<String, Double> servicesRendered = new HashMap<>();
		servicesRendered.put("walking", 10.0);
		servicesRendered.put("grooming", 20.0);
		servicesRendered.put("sitting", 50.0);
		
		man.getBalanceDue(servicesRendered);
		
		double expected = 80;
		double actual = man.getBalanceDue(servicesRendered);
		
		Assert.assertEquals(expected, actual, 0.0);
	
	}
 
	
}
