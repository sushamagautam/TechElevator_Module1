package demo;

import com.techelevator.logger.*;

public class Application {

	public static void main(String[] args) {
		
		// TODO: Use the Static Log class to manage application logging
		
		Log.setLogFile("data", "app_log.txt");
		
		Log.instance().flush();
		
		Log.instance().write("Hi! ");
		Log.instance().writeLine("Whoa, I need a new line!");
		Log.instance().write("OK, ");
		Log.instance().write("Hi!");
		
		Log.instance().writeLine("");
		
		Log.instance().write("New Log Block: ");
		Log.instance().writeLine("Event 23");
		
		doStuff();
		
	}
	
	
	public static void doStuff() {
		// TODO: Do something and log it here too
	
	}

}
