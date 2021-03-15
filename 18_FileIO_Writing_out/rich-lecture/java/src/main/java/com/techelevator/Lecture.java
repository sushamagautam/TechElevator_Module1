package com.techelevator;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Lecture {

	public static void main(String[] args) throws IOException {

		Scanner userInput = new Scanner(System.in);

		/*
		 * The java.io.File class is a representation of file and directory path names.  It provides methods to inspect and
		 * modify file system objects.
		 *
		 * One benefit is that it compensates for differences in Windows and Unix use of '/' and '\' as directory delimiters.
		 *
		 * A new instance of File can be created from a String that contains a file system path
		 */

		System.out.println("Please enter the path of a file or directory :");
		String pathName = userInput.nextLine();
		
		File userPath = new File(pathName);
		
		/*
		 * The File class allows us to inspect various attributes of a file system object
		 */

		/* ***************************
		 * INSPECTING THE FILESYSTEM
		 * ***************************/
		
		System.out.println("----------------------\n");
		
		if(userPath.exists()) {
			
			System.out.println("name : " + userPath.getName());
			System.out.println("it lives in parent : " + userPath.getParent());
			System.out.println("absolute path : " + userPath.getAbsolutePath());
			System.out.println("canonical path : " + userPath.getCanonicalPath());
			
			if(userPath.isDirectory()) {
				System.out.println(userPath.getName() + " is a directory");
			}else if(userPath.isFile()) {
				System.out.println(userPath.getName() + " is a file");
			}else {
				System.out.println(userPath.getName() + " is neither a file or a directory. "
						+ "But, the parent is: " + userPath.getParent());
			}
			
		}
		else {
			System.out.println("Whoa! " + userPath.getAbsolutePath() + " does not exist");
		}
		
		
		/*
		 * The File class also allows us to manipulate file system objects
		 * */

		/* ************************
		 * CREATING A DIRECTORY
		 * ************************/
		
		System.out.println();
		System.out.println("Let's create a new directory.");
		System.out.print("Enter the path of the new directory : ");
		
		String newDirectoryName = userInput.nextLine();
		
		File newDirectory = new File(newDirectoryName);
		
		if(!newDirectory.exists()) {
			System.out.println("Creating directory : " + newDirectory.getName());
			
			if(newDirectory.mkdir()) {
				System.out.println(newDirectory.getName() + " has been created!");
			}else {
				System.out.println("Unable to create directory : " + newDirectory.getName());
			}
	
		}else {
			System.out.println("Directory already exists!");
		}
		
		
		/* ************************
		 * CREATING A FILE
		 * ************************/
		System.out.println("----------------------\n");
		System.out.println("Enter a new file to create in the new directory: ");
		
		String newFileName = userInput.nextLine();
		
		File newFile = new File(newDirectory.getName(),newFileName);
		
		if(newFile.createNewFile()) {
			System.out.println("File Created!");
			System.out.println("File Length : " + newFile.length());
			System.out.println("Last Modified : " + newFile.lastModified());
		}else{
			System.out.println("Oops! I can't create it ...");
			if(newFile.exists()) {
				System.out.println("... because it already exists!");
			}
		}
		
		/* ************************
		 * WRITING TO A FILE
		 * ************************/
		
		System.out.println("----------------------\n");
		System.out.println("Enter data to add to the file " + newFile.getPath() + ": ");
		
		String fileData = userInput.nextLine();
		
		try(PrintWriter fileWriter = new PrintWriter(newFile)){
			fileWriter.println(fileData);
			
			System.out.println("File Updated!");
			System.out.println("File Length : " + newFile.length());
			System.out.println("Last Modified : " + newFile.lastModified());
			
		}
		catch(Exception ex){
			System.out.println("Error: " + ex.getMessage());
		}
		
		System.out.println("File Length : " + newFile.length());
		System.out.println("Last Modified : " + newFile.lastModified());
		
		

		
		
		

	}

}
