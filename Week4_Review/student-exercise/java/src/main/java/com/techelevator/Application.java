package com.techelevator;

import com.techelevator.search.SearchDomain;
import com.techelevator.search.SearchEngine;
import com.techelevator.util.*;

public class Application {

	public static void main(String[] args) {
		
		try {
			TELogException TLE = new TELogException("Test exception");
			System.out.println(TLE.toString());
			
			//Doesn't work
			//TELog TEL = new TELog();
			
			
			// Step Two: Create TELog, and log the start of the application.
			//
			

			TELog TEL = new TELog("logs", "search.log");
			
			TEL.Log("The Application Started");
			
			TEL.Log(".... and it's still going");
			
			TEL.flush();
			TEL.Log("It's clean now. Let's get to the utility!!");
			
			// Step Four: Instantiate a Search Domain
			//
			SearchDomain SD = new SearchDomain("data");
			
			System.out.println(SD.getFiles());
			
			
			// Step Six: Single word search
			//

			SearchEngine SE = new SearchEngine(SD);
			
			SE.indexFiles();
			
			SE.search(searchString);
			
			// Step Seven: Multiple word search
			//
			
			
			
		}
		catch (Exception e) {
			e.printStackTrace();
		}
	}
}
