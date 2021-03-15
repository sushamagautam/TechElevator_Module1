package com.techelevator;

public class Television {
	
	//instance variables
	private boolean isOn;
	private int currentChannel;
	private int currentVolume;

	//constructor
	
	public Television() {
		isOn = false;					// new TV is off by default. The channel is set to three and 
		currentChannel = 3;						//the volume level to two.
		currentVolume = 2;
	}
	
	//class getters
	public boolean isOn() {
		return isOn;
	}
	public int getCurrentChannel() {
		return currentChannel;
	}
	public int getCurrentVolume() {
		return currentVolume;
	}
	
	//class methods
	public void turnOff() {
		isOn = false;
	}
	public void turnOn() {
		isOn = true;
		currentChannel = 3;
		currentVolume = 2;
	}
	public void changeChannel(int newChannel) { 			//changeChannel(int newChannel) changes the current channel 
		if (isOn && newChannel >=3 && newChannel <= 18) {		//(only if it is on) to the value of newChannel as long 
		currentChannel = newChannel; }								//as it is between 3 and 18
	}
	public void channelUp() {
		if (isOn && currentChannel < 18) {		//channelUp() increases the current channel by 1 (only if it is on). If 
			currentChannel += 1;				//the value goes past 18, then the current channel should be set to 3.
		}
		else if (isOn && currentChannel >= 18) {
			currentChannel = 3;
		}
	}
	public void channelDown() {				//channelDown() decreases the current channel by 1 (only if it is on). If 
		if (isOn && currentChannel > 3)	{	// the value goes below 3, then the current channel should be set to 18.
			currentChannel -= 1; 
		}
		else if (isOn && currentChannel <= 3) {
			currentChannel = 18;
		}
	}
	
	public void raiseVolume() {		//raiseVolume() increases the volume by one, only if it's on. The limit is 10.
		if(isOn && currentVolume < 10) {
			currentVolume += 1;
		}
	}
	public void lowerVolume() {		//lowerVolume() decreases the volume by one, only if it's on. The limit is zero
		if(isOn && currentVolume >= 1) {
			currentVolume -= 1;
		}
	}
	
	
}	
	
