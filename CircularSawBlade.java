/*
 * Student Name: Akpoguma Oghenerukevwe
 * Lab Professor: David Houtman
 * Due Date: November 25th, 2022.
 * Description: Assignment 02 (22F) Starter Code
 */

//This class models a circular saw blade with diameter and kerf
public class CircularSawBlade { 

	public static final double EXPECTED_DIAMETER = 7.25; 
	public static final double EXPECTED_KERF = 0.059;
	private double diameter; 
	private double kerf; 
	
	// No-argument constructor, sets diameter and kerf to the same values as the constants.
	public CircularSawBlade() { 
		this(EXPECTED_DIAMETER, EXPECTED_KERF); 
	}
	
	// Overloaded constructor, sets diameter and kerf as specified. 
	public CircularSawBlade(double diameter, double kerf) { 
		this.diameter = diameter;
		this.kerf = kerf;
	}

	//Accessor for diameter, uses inches as unit of measure
	public double getDiameter() { 
		return diameter;
	}

	//Mutator for diameter, uses inches as unit of measure
	public void setDiameter(double diameter) { 
		this.diameter = diameter;
	}

	//Accessor for Kerf, uses inches as unit of measure
	public double getKerf() { 
		return kerf;
	}

	// Mutator for Kerf, uses inches as unit of measure
	public void setKerf(double kerf) { 
		this.kerf = kerf;
	}
	
	// Returns a String that represents the data held within this object.
	public String toString() { 
		String result;

		result = String.format(
				"""
				diameter: %.4f (inch), width: %.4f (inch) \
				""", diameter, kerf);
		
		return result;
	}
	
}
/*
 * References:
 * [1] C. Baylor. What Does the Term "Kerf" Mean in Woodworking?. thesprucecrafts.com.
 * https://www.thesprucecrafts.com/definition-of-kerf-3536563 (Accessed Oct 28, 2022).
 */