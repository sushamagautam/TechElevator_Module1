package com.techelevator;

import org.junit.*;

public class AnimalGroupNameTest {
 
	AnimalGroupName AGN;
	@Before
	public void createClass() {
		 AGN = new AnimalGroupName();
	}  
	   
	@Test  
	public void test_01_getHerd_Seagul_Return_unknown() {
		
		String actualResult = AGN.getHerd("Seagul"); 
		String expectedResult = "unknown";
		 
		Assert.assertEquals(expectedResult, actualResult);
	}
	@Test
	public void test_01_getHerd_Rhino_Not_Return_unknown() {
		
		String errorResult = "unknown";
		String actualResult = AGN.getHerd("Rhino");
		
		Assert.assertFalse(actualResult.equals(errorResult));
	}
	
	@Test
	public void test_01_getHerd_Null_Returns_unknown() {
		
		String actualResult = "unknown";
		String expectedResult = AGN.getHerd(null);
		
		Assert.assertEquals(expectedResult, actualResult);
	}
	 
}
