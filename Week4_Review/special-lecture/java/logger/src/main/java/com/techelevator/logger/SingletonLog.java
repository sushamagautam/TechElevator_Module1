package com.techelevator.logger;

import java.io.File;
import java.io.FileOutputStream;
import java.io.PrintWriter;
import java.sql.Date;
import java.sql.Timestamp;
import java.text.DateFormat;


/**
 * @author Rich Seeds
 * @apiNote An application level Log using a Singleton Pattern
 * Research appropriate uses of Singletons ( This is an advanced junior topic )
 * 
 * @version 0.2.2
 * 
 * @see <a href="https://www.tutorialspoint.com/design_pattern/singleton_pattern.htm"> The Singleton Pattern </a>
 */

public class SingletonLog {

	
	private File logFile;
	//private SingletonLog instanceLog;	
	
	
	public SingletonLog() { 
		// PRIVATE CTOR ??
	}
	
	public void setLogFile(String directoryName, String logFileName) {
		
		// TODO: Set the log file location
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
