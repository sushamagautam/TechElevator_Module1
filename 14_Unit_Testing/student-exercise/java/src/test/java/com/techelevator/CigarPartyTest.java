package com.techelevator;

import org.junit.*;

public class CigarPartyTest {

	CigarParty CP;
	@Before
	public void createClass() {
		 CP = new CigarParty();
	} 
	
	@Test
	public void CigarParty_Test01_On_Weekend() {
		 boolean actualResult = CP.haveParty(50, true);
		 boolean expectedResult = true;
		 
		 Assert.assertEquals(expectedResult, actualResult);
	}
	@Test
	public void CigarParty_Test02_Successful_Party() {
		 boolean actualResult = CP.haveParty(41, true);
		 boolean expectedResult = CP.haveParty(50, true);
		 
		 Assert.assertEquals(expectedResult, actualResult);
	}

	@Test
	public void CigarParty_Test03_Successful_Party() {
		 boolean actualResult = CP.haveParty(52, true);
		 boolean expectedResult = CP.haveParty(40, true);
		 
		 Assert.assertEquals(expectedResult, actualResult);
	}
	@Test
	public void CigarParty_Test04_On_Weekend() {
		 boolean actualResult = CP.haveParty(70, false);
		 boolean expectedResult = false;
		 
		 Assert.assertEquals(expectedResult, actualResult);
	}
}

