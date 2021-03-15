package com.techelevator;
import static org.junit.Assert.*;
import java.util.HashMap;
import java.util.Map;
import org.junit.Test; 
public class WordCountTest {
	
	
	@Test
	public void testInArray_FirstStringAppearsTheMost() {
		
		WordCount wordCount = new WordCount();
		Map<String, Integer> expected = new HashMap<>();
		
		expected.put("ba", 2);
		expected.put("black", 1);
		expected.put("sheep", 1);
		
		
		String[] words = {"ba", "ba", "black", "sheep"};
		Map<String, Integer> result = wordCount.getCount(words);
	
		assertEquals(expected, result);		
		
	} 
}