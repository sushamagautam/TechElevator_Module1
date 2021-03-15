package town;

import com.techelevator.farm.*;

public class GreenVille {
	
	
	/*** THIS IS ONLY TO DEMONSTRATE THE 'PROTECTED' KEYWORD ***/
	
	public static void main(String[] args) {
		
		GreenVilleAnimal gvCow = new GreenVilleAnimal("Tom", "Hiya");
		Cow farmCow = new Cow();
		
		System.out.println(farmCow.getSound());
		System.out.println(gvCow.getSound());
		
		
		
		// This is the town package, it can't see the Nature property because Nature is PROTECTED!
		//System.out.println(farmCow.nature);
		// I can't even get to the Nature of the gvCow because it is now living outside of techelevator.farm
		//System.out.println(gvCow.nature);
		

		
		
	}

}
