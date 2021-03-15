package town;

import com.techelevator.farm.*;

public class GreenVille {

	public static void main(String[] args) {
		
		GreenVilleAnimal gvCow = new GreenVilleAnimal("Tom", "Hiya");
		Cow farmCow = new Cow();
		
		System.out.println(farmCow.getSound());
		System.out.println(gvCow.getSound());
		//this is the town package, it can't see the nature property
		//System.out.println(gvCow.nature);
		
		System.out.println(gvCow.getNature());

	}
	
}
