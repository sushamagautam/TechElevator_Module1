package com.techelevator;

public class HomeworkAssignment {

	//class Data Members
	//earnedMarks | int | X | X | The total number of correct marks submitter received on the assignment. || 
	//possibleMarks | int | X || The number of possible marks on the assignment. || submitterName | string | X ||
	//The submitter's name for the assignment. || letterGrade(derived)| string | X || The letter grade for the assignment
	
	//instance variables
	private int earnedMarks;
	private int possibleMarks;
	private String submitterName;
	private String letterGrade;
	
	//Constructor: The HomeworkAssignment class has a single constructor. It accepts two arguments: int possibleMarks
	//and String submitterName. Use these parameters to set the instance variables of the class.
	
	public HomeworkAssignment(int possibleMarks, String submitterName) {
		this.possibleMarks = possibleMarks;
		this.submitterName = submitterName;
	}
	
	//setters and getters
	
	public int getEarnedMarks() {
		return earnedMarks;				//return totalMarks
	}
	
	//parameter totalMarks to set
	public void setEarnedMarks(int earnedMarks) {
		this.earnedMarks = earnedMarks;
	}
	public int getPossibleMarks() {
		return possibleMarks;			//return possibleMarks
	}
	public String getSubmitterName() {
		return submitterName;			//return submiteterName
	}
	
	
	//return the letterGrade
	public String getLetterGrade() {
		double gradeValue = ((double) earnedMarks/(double) possibleMarks) * 100;
		
		{if(gradeValue >= 90) {
			letterGrade = "A";		//letterGrade is a derived attribute that's calculated using earnedMarks and possibleMarks:
		}													//•For 90% or greater, it returns "A"
		else if (gradeValue < 90 && gradeValue >= 80){		//•For 80-89%, it returns "B"
			letterGrade = "B";								//•For 70-79%, it returns "C"
		}													//•For 60-69%, it returns "D"
		else if (gradeValue < 80 && gradeValue >= 70) {		//•Otherwise, it returns "F"
			letterGrade = "C";								//•_hint_: possibleMarks and earnedMarks are ints. What happens 
		}													//when a smaller integer is divided by a larger integer?
		else if (gradeValue < 70 && gradeValue >= 60) {		
			letterGrade = "D";								
		}	
		else
			letterGrade = "F";							
		}
		return letterGrade;
	}
	
	public void setLetterGrade(String letterGrade) {
		this.letterGrade = letterGrade;
	}
	
}
