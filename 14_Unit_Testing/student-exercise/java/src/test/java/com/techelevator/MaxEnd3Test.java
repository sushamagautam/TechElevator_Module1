package com.techelevator;

import static org.junit.Assert.assertArrayEquals;
import org.junit.Assert;
import org.junit.Test;

public class MaxEnd3Test {
	MaxEnd3 maxEnd3 = new MaxEnd3();
		 
	@Test
	public void test1_maxEnd3() {
		
		int[] expected = new int[] {11,11,11};
		int[] nums1 = {11,5,9};
		
		int[] result = maxEnd3.makeArray(nums1);
		
		assertArrayEquals(expected, result);
		 
	}
	@Test
	public void test2_maxEnd3() {
		
		int[] expected = new int[] {3, 3, 3};
		int[] nums2 = {2,11,3};
		int[] result = maxEnd3.makeArray(nums2);
		
		assertArrayEquals(expected, result);
		
	}
	
	
	}
