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
 * @version 0.2.2
 */

public class Log {

	
	private static File logFile;
	private static Log instanceLog;	
	
	
	public static Log instance() {
		
		if( instanceLog == null) { instanceLog = new Log(); }
		
		return instanceLog;
	}
	
	private Log() { 
		// PRIVATE CTOR
	}
	
	public static void setLogFile(String directoryName, String logFileName) {
		
		if(logFile == null) {
		
			File logDirectory = new File(directoryName);
			
			if(!logDirectory.exists()) { logDirectory.mkdir(); }
			
			logFile = new File(directoryName, logFileName);

		}
	}
	
	public boolean write(String logMessage) {
		
		try(PrintWriter logWriter = new PrintWriter( new FileOutputStream(Log.logFile, true))){
			
			logWriter.append(logMessage);
			return true;
			
		}
		catch(Exception ex){
			return false;
		}
		
	}
	
	public boolean writeLine(String logMessage) {
		
		try(PrintWriter logWriter = new PrintWriter( new FileOutputStream(Log.logFile, true))){
			
			logWriter.append(logMessage + "\n");
			return true;
			
		}
		catch(Exception ex){
			return false;
		}
		
	}
	
	public boolean stamp() {
		// TODO: Implement a Method to Stamp a Log with the current Date & Time
		
		
		return false;
	}
	
	public boolean flush() {
		
		try (PrintWriter flushLog = new PrintWriter( Log.logFile)){
			
			Timestamp ts=new Timestamp(System.currentTimeMillis());  
            Date flushDate=new Date(ts.getTime());  
            
            String printDate = DateFormat.getDateTimeInstance(DateFormat.LONG, DateFormat.LONG).format(flushDate);
			
			flushLog.println("FLUSHED: " + printDate);
			
			return true;
			
		} 
		catch (Exception ex) {
			return false;
		}
		
	}
	
}
