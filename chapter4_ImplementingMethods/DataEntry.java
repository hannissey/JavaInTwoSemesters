package chapter4_ImplementingMethods;

import java.util.*;

public class DataEntry {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String firstName, familyName, town;
		
		//prompt for first name
		System.out.println("Please enter your first name ");
		
		displayMessage();
		
		//get first name from user
		firstName = sc.next();
		
		// prompt for family name
		System.out.println("Please enter your family name");

		displayMessage();
		
		//get family name from user
		familyName = sc.next();
		
		//prompt for town
		System.out.println("Please enter your town");
		
		displayMessage();
		
		//get town from user
		town = sc.next();
		
		//more code here
		
	}
	
	private static void displayMessage() {
		//display confidentiality message
		// a private method such as this can be described as a helper method
		System.out.println("Please note that all information supplied is confidential.");
		System.out.println("No personal details will be shared with any third party.");
	}
}
