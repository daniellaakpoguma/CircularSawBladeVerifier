/*
 * Student Name: Akpoguma Oghenerukevwe
 * Lab Professor: David Houtman
 * Due Date: November 25th, 2022.
 * Description: Assignment 02 (22F) Starter Code 
 */

/* Class to allow user input diameter and the kerf, verifies both input, reports it to the user,
 * determines whether the kerfs and diamters are in or out of tolerance, reports the number of 
 * saw blades entered, and how many measurements of diameters and kerfs were out of tolerance.
 */
public class Assignment02 { 

	public static void main(String[] args) { //entry point for program
	
		CircularSawBlade blade = new CircularSawBlade(); //instantiation of CircularSawBlade
		
		double input;
		boolean continueInput = true;
		int bladeCount=0;
		int diameterOutOfTolerance = 0;
		int kerfOutOfTolerance =0;
		String shouldContinue;
		
		
		while(continueInput == true) {
			
		
	    input= User.inputPositiveDouble("Enter measured diameter:"); //inputPositiveDouble of class User to verify input from user
	    blade.setDiameter(input);
	     
	    input = User.inputPositiveDouble("Enter measured kerf:");//inputPositiveDouble of class User to verify input from user
	    blade.setKerf(input);
		
		System.out.println(blade.toString()); // toString method of class CircularSawBlade to output the information for the blade.
		
		//isDiameterInTolerance of CircularSawBladeVerifier method to determine whether diameter is or out of tolerance
		if(CircularSawBladeVerifier.isDiameterInTolerance(blade)==true) {
			System.out.println("Diameter in Tolerance");
		}else {
		     System.out.println("Diameter out of Tolerance");
		     diameterOutOfTolerance++;
		}
		
		//isKerfInTolerance of CircularSawBladeVerifier method to determine whether kerf is or out of tolerance
		if(CircularSawBladeVerifier.isKerfInTolerance(blade)==true) { 
			System.out.println("Kerf in Tolerance");
		}else {
			System.out.println("Kerf out of tolerance");
			kerfOutOfTolerance++;
		}
		
		bladeCount++;
		System.out.println("Blades Entered:"+ bladeCount);
		System.out.println ("Diameter(s) out of tolerance:"+ diameterOutOfTolerance);
		System.out.println("Kerf(s) out of tolerance:"+ kerfOutOfTolerance);
		
		
		System.out.println("Program By Akpoguma Oghenerukevwe"); 
		
		//Looop to prompt user to decide whether or not they want to continue with the program
		shouldContinue = User.inputString("Continue (yes/no)?");
		
		if (shouldContinue.equalsIgnoreCase("Yes")) { 
			continueInput = true;
		}else if(shouldContinue.equalsIgnoreCase("No")){
			continueInput = false;
			System.out.println("Program has shut down");
		}

	}
}
}

/*
 * References:
 * [1] C. Baylor. What Does the Term "Kerf" Mean in Woodworking?. thesprucecrafts.com.
 * https://www.thesprucecrafts.com/definition-of-kerf-3536563 (Accessed Oct 28, 2022).
 */