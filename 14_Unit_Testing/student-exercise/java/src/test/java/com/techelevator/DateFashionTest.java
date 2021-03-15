package com.techelevator;

import java.util.*;
import org.junit.Before;
import org.junit.Test;

import junit.framework.Assert;

public class DateFashionTest {
	 
	DateFashion DF;
	@Before
	public void createClass() {
		 DF = new DateFashion();
	} 
	@Test
	public void DateFashion_test_01() {
		 Integer actualResult = DF.getATable(5, 10);
		 Integer expectedResult = 2;
		  
		Assert.assertEquals(expectedResult, actualResult);
	}
	@Test
	public void DateFashion_test_02() {
		 Integer actualResult = DF.getATable(2, 2);
		 Integer expectedResult = 0;
		 
		Assert.assertEquals(expectedResult, actualResult);
	}
	@Test
	public void DateFashion_test_03() {
		 Integer actualResult = DF.getATable(9, 10);
		 Integer expectedResult = 2;
		 
		Assert.assertEquals(expectedResult, actualResult);
	}
}
