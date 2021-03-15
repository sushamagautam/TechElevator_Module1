package com.techelevator.draw.tool;

public class Draw {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WoodenPencil pencil = new WoodenPencil();
		
		
    	System.out.println("Pencil length: " + pencil.getLength() + " inches");
    	System.out.println("Pencil sharpness: " + pencil.getSharpness());
    	System.out.println();
    	
    	pencil.sharpen();
    	System.out.println("Sharpening...");
    	System.out.println("Pencil length: " + pencil.getLength() + " inches");
    	System.out.println("Pencil sharpness: " + pencil.getSharpness());
    	System.out.println();
    	
    	pencil.write();
    	System.out.println("Writing...");
    	System.out.println("Pencil sharpness: " + pencil.getSharpness());
    	System.out.println();
    	
    	pencil.sharpen();
    	System.out.println("Sharpening...");
    	System.out.println("Pencil length: " +  pencil.getLength() + " inches");
    	System.out.println("Pencil sharpness: " + pencil.getSharpness());

    	//WHAT ABOUT THOSE STATICS
    	
    	System.out.println(WoodenPencil.DEFAULT_COLOR);
    	System.out.println(WoodenPencil.DEFAULT_SHAPE);
    	
    	System.out.println("Class Dullness Variable: " + WoodenPencil.getMaxDullness());
    	System.out.println("Instance Dullness Variable: " + pencil.getDullness());
    	
    	System.out.println("Modify Class Dullness Variable");
    	WoodenPencil.setMaxDullness(0.2d);
    	
    	System.out.print("Class Dullness Variable is now: ");
    
    	System.out.println(WoodenPencil.getMaxDullness());
    	
    	System.out.println("Instance Dullness Variable is now: " + pencil.getDullness());
    	
    	WoodenPencil newPencil = new WoodenPencil();
    	
    	System.out.println("The NEW Instance Dullness Variable is now: " + newPencil.getDullness());
    	
	}

}
