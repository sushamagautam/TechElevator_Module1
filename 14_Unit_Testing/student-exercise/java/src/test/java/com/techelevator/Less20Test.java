package com.techelevator;

import java.util.*;
import org.junit.Before;
import org.junit.Test;

import junit.framework.Assert;

public class Less20Test {
	
	Less20 LT;
	@Before
	public void createClass() {
		 LT = new Less20(); 
	}   
	
	@Test 
	public void Less20_Test1() {
		boolean actualResult = LT.isLessThanMultipleOf20(39);
		boolean expectedResult = true;
		 
		Assert.assertEquals(expectedResult, actualResult);
	}
	@Test
	public void Less20_Test2() {
		boolean actualResult = LT.isLessThanMultipleOf20(45);
		boolean expectedResult = false;
		
		Assert.assertEquals(expectedResult, actualResult);
	}
}
