package com.techelevator;

import org.junit.*;

public class FrontTimesTest {

	FrontTimes FT;
	@Before
	public void createClass() {
		 FT = new FrontTimes();
	} 
	  
	
	@Test
	public void test_01_FrontTimes_Less_Than_4(){
		String actualResult = FT.generateString("Cat", 2);
		String expectedResult = "CatCat"; 
		   
		Assert.assertEquals(expectedResult, actualResult);
	} 
	 
	@Test
	public void test_02_FrontTimes_Less_Than_3(){
		String actualResult = FT.generateString("Home", 4);
		String expectedResult = "HomHomHomHom";
		
		Assert.assertEquals(expectedResult, actualResult);
	}
	
	@Test
	public void test_03_FrontTimes_isNull(){
		String actualResult = FT.generateString("", 2);
		String expectedResult = "";
		
		Assert.assertEquals(expectedResult, actualResult);
	}
	
}
