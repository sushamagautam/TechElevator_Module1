package com.techelevator;
import java.util.*;
 
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
public class NonStartTest {

	NonStart NS;
	@Before
	public void createClass() {
		 NS = new NonStart();
	} 
	
	@Test
	public void NonStart_test_01() {
		String actualResult = NS.getPartialString("Hello","There");
		String expectedResult = "ellohere";
		
		Assert.assertEquals(expectedResult, actualResult);
		}
	@Test
	public void NonStart_test_02() {
		String actualResult = NS.getPartialString(" ","code");
		String expectedResult = "ode";
		
		Assert.assertEquals(expectedResult, actualResult);
		}
	@Test
	public void NonStart_test_03() {
		String actualResult = NS.getPartialString("av"," ");
		String expectedResult = "v";
		
		Assert.assertEquals(expectedResult, actualResult);
		}
	@Test
	public void NonStart_test_04() {
		String actualResult = NS.getPartialString(" "," ");
		String expectedResult = "";
		
		Assert.assertEquals(expectedResult, actualResult);
		}
	}
