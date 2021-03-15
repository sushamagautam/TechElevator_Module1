package com.techelevator;
import java.util.*;

import org.junit.Before;
import org.junit.Test;

import junit.framework.Assert;

public class SameFirstLastTest {

	SameFirstLast SFL;
	@Before
	public void createClass() {
		 SFL = new SameFirstLast(); 
	}  
	
	@Test
	public void SameFirstLast_test01() {
		boolean actualResult = SFL.isItTheSame(1, 2, 3);
		boolean expectedResult = false;
		
		Assert.assertEquals(expectedResult, actualResult);
	}
	@Test
	public void SameFirstLast_test02() {
		boolean actualResult = SFL.isItTheSame(3, 1, 3);
		boolean expectedResult = false;
		 
		Assert.assertEquals(expectedResult, actualResult);
	} 
	@Test
	public void SameFirstLast_test03() {
		boolean actualResult = SFL.isItTheSame(null);
		boolean expectedResult = false;
		
		Assert.assertEquals(expectedResult, actualResult);
	} 
	
}
