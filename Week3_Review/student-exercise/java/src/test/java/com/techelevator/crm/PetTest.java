package com.techelevator.crm;
import org.junit.*;
import java.util.ArrayList;
import java.util.List;
  

public class PetTest {

	Pet pet = new Pet("Jack", "Lab");

	@Test 
	public void test_01() { 
		
		List<String> vacs = new ArrayList<>();
		
		vacs.add("Rabies");
		vacs.add("Distemper");
		vacs.add("Parvo");
		
		pet.setVaccinations(vacs);
		
		String actualResult = pet.listVaccinations();
		String expectedResult = "Rabies, Distemper, Parvo";
		
		Assert.assertEquals(expectedResult, actualResult);
	}  
}  
