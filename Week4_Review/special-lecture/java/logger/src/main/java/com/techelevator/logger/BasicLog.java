package com.techelevator.logger;

import java.io.File;
import java.io.FileOutputStream;
import java.io.PrintWriter;
import java.sql.Date;
import java.sql.Timestamp;
import java.text.DateFormat;


/**
 * @author Rich Seeds
 * @apiNote A class to log events

 * @version 0.2.2
 */

public class BasicLog {

	
	private File logFile;
	
	public BasicLog() { 
		// PRIVATE CTOR
	}
	
	public void setLogFile(String directoryName, String logFileName) {
		

	}
	
	public boolean write(String logMessage) {
		
		return false;
		
	}
	
	public boolean writeLine(String logMessage) {
		
		return false;
		
	}
	
	public boolean stamp() {
		// TODO: Implement a Method to Stamp a Log with the current Date & Time
		
		
		return false;
	}
	
	public boolean flush() {
		

		return false;
	}
	
}
