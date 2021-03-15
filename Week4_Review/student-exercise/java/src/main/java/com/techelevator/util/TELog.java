package com.techelevator.util;

import java.io.File;
import java.io.FileOutputStream;
import java.io.PrintWriter;
import java.sql.Timestamp;
import java.text.DateFormat;
import java.sql.Date;

public class TELog {

	private File LogFile;
	private File logDirectory;

	public void setFileName(String logFileName) {
		LogFile = new File(logFileName);
	}
	
	public TELog() {
		//Default CTOR
	}
	
	public TELog(String logDirectory, String logFile) {
	//Default CTOR
	try {
		
		this.logDirectory = new File(logDirectory);
	
		if(!this.logDirectory.exists()) {
			this.logDirectory.mkdir();
		}
			this.LogFile = new File(this.logDirectory, logFile);
	}
		catch(Exception ex) {
			throw new TELogException(ex.getMessage());
		}
	}

	
	public boolean Log(String logMessage) {
		//Default will be to write a single line and append
		
		try (PrintWriter logWriter = new PrintWriter(new FileOutputStream(this.LogFile, true))){
		logWriter.append(logMessage + "\n");
		
			return true;
		}
		catch(Exception ex) {
			
		}
		return false;

	}

public boolean flush() {
	try(PrintWriter flushWriter = new PrintWriter(this.LogFile)){
		
		Timestamp ts = new Timestamp(System.currentTimeMillis());
		Date flushDate = new Date(ts.getTime());
		
		String printDate = DateFormat.getDateTimeInstance(DateFormat.LONG, DateFormat.LONG).format(flushDate);
		flushWriter.print("LOG FLUSHED : " + printDate);
		
		return true;
	
	}
	catch(Exception ex) {
		return false;
		
	}
}
}