package com.techelevator;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import java.util.*;

import org.junit.Before;
import org.junit.Test;

import junit.framework.Assert;
 
public class Lucky13Test {
	Lucky13 lucky = new Lucky13();
	int[] number = {0, 2, 4};
	 
	  
	@Test
	public void Lucky13_Test1() {
		boolean actualResult = lucky.getLucky(number);
		boolean expectedResult = true;
		
		Assert.assertEquals(expectedResult, actualResult);
	}
	int[] number1 = {0, 3, 4};
	
	@Test
	public void Lucky13_Test2() {
		boolean actualResult = lucky.getLucky(number1);
		boolean expectedResult = false;
		
		Assert.assertEquals(expectedResult, actualResult);
	}
	
}
