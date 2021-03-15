package com.techelevator;
import java.util.*;

import org.junit.Before;
import org.junit.Test;

import junit.framework.Assert;

public class StringBitsTest {
	StringBits SB;
	
	@Before
	public void createClass() {
		SB = new StringBits(); 
	}  
	@Test
	public void StringBits_Test1() {
		String actualResult = SB.getBits("Hello");
		String expectedResult = "Hlo";
		
		Assert.assertEquals(expectedResult, actualResult);
	}
	@Test
	public void StringBits_Test2() {
		String actualResult = SB.getBits(" ");
		String expectedResult = " ";
		
		Assert.assertEquals(expectedResult, actualResult);
	}
	
	
	
	
}
