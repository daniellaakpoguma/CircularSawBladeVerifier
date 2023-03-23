/*
 * Student Name: Akpoguma Oghenerukevwe
 * Lab Professor: David Houtman
 * Due Date: November 25th, 2022.
 * Description: Assignment 02 (22F) Starter Code
 */

import java.util.Scanner;

//This class contains methods that make sure the user input if that of which the program expects
public class User { 
	
	private static Scanner keyboard = new Scanner(System.in);
	
	private User() {}//private constructor 
	
	//method to make sure an int value is entered by the user
	public static int inputInteger() { 
		boolean isInputBad = true;
		boolean hasNextInt;
		int value = 0;
		while(isInputBad) {
			hasNextInt = keyboard.hasNextInt();
			if(hasNextInt) {
				value = keyboard.nextInt();
				isInputBad = false; 
			}
			else {
				System.out.print("Invalid input. Enter an integer number: ");
			}
			keyboard.nextLine(); 
		}
		return value;
	}
	
	//method to prompt the user to input value and then calls inputInteger()
	public static int inputInteger(String message) { 
		System.out.printf("%s", message);
		int value = inputInteger(); 
		return value;
	}
	
	/*method to prompt the user to enter a value and verify whether the value is a double
	 * if not, it sends out a error message asking for the correct input
	 */
	public static double inputDouble() { 
		boolean isInputBad = true;
		boolean hasNextDouble;
		double value = 0.0;
		while(isInputBad) {
			hasNextDouble = keyboard.hasNextDouble();
			if(hasNextDouble) {
				value = keyboard.nextDouble();
				isInputBad = false; 
			}
			else {
				System.out.print("Invalid input. Enter a number: ");
			}
			keyboard.nextLine(); 
		}
		return value;	
	}
	
	//method to prompt user to input value and then call inputDouble()
	public static double inputDouble(String message) { 
		System.out.printf("%s", message);
		double value = inputDouble();
		return value;
	}
	
	//method to get String value from user
	public static String inputString() { 
		String value = keyboard.nextLine();
		return value;
	}
	
	 //method to prompt user for value and calls inputString
	public static String inputString(String message) {
		System.out.printf("%s", message);
		String value = inputString();
		return value;
	}
	
	/*method to prompt user to input value, and that verifies whether a double is being inputed by calling inputDouble(),
	 * and then verifying if the double entered is positive
	 */
	public static double inputPositiveDouble(String prompt) { 
	    System.out.printf("%s",prompt);
	    double value = 0.0;
		boolean isInputBad = true;
		while(isInputBad) {
			value = inputDouble();
			if(value > 0) {
				isInputBad = false;
			} else {
				System.out.print("Invalid input. Enter a positive number: ");
			}
		}
		return value;
}
}