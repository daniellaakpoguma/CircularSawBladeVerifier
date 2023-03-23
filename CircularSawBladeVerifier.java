/*
 * Student Name: Akpoguma Oghenerukevwe
 * Lab Professor: David Houtman
 * Due Date: November 25th, 2022.
 * Description: Assignment 02 (22F) Starter Code
 */

// class that verifies whether the diameter and kerf entered is in or out of tolerance.
public class CircularSawBladeVerifier {
	public final static double EPSILON =1E-14;

	// private default constructor to prevent instantiation
	private CircularSawBladeVerifier() {}
	
	/* 
	 * static method to return boolean(true or false) if the Diameter is out of tolerance or not
	 */
	public static boolean isDiameterInTolerance(CircularSawBlade blade) {
		boolean diameterInTolerance;
		diameterInTolerance = Math.abs(blade.getDiameter() - CircularSawBlade.EXPECTED_DIAMETER)<= EPSILON;
		return diameterInTolerance;		
	}
	
	/* 
	 * static method to return boolean(true or false) if the Kerf is out of tolerance or not
	 */
	public static boolean isKerfInTolerance(CircularSawBlade blade) {
		boolean kerfInTolerance;
		kerfInTolerance = Math.abs(blade.getKerf()- CircularSawBlade.EXPECTED_KERF)<= EPSILON ;
		return kerfInTolerance;
	}
		
		
}

/*
 * References:
 * [1] C. Baylor. What Does the Term "Kerf" Mean in Woodworking?. thesprucecrafts.com.
 * https://www.thesprucecrafts.com/definition-of-kerf-3536563 (Accessed Oct 28, 2022).
 */