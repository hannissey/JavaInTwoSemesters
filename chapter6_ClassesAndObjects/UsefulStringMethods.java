package chapter6_ClassesAndObjects;

import java.util.*;

public class UsefulStringMethods {	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		// create a new string
		String str = new String();
		
		// get the user to enter a string and store it in str
		System.out.println("Enter a string: ");
		str = sc.nextLine(); // NB: next sees a space as the end of the input, nextLine takes the whole input
		
		// display the length of the user's string
		System.out.println("The length of the string is " + str.length());
		
		// display the third character 
		System.out.println("The third character of the string is " + str.charAt(2));
		
		// display a selected part of the string
		System.out.println("The string from character 2 to character 6 is " + str.substring(1,5));
		
		// display the user's string joined with another string
		String newString = "New String";
		System.out.println("The user's string joined with a new string is " + str.concat(newString));
		
		// display the user's string in uppercase
		System.out.println("The string in uppercase is " + str.toUpperCase());
		
		// display the user's string in lowercase
		System.out.println("The string in lowercase is " + str.toLowerCase());
		
		
	}

}
