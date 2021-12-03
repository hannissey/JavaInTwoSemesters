package chapter6_ClassesAndObjects;

/* Write a program that asks the user to input a string, followed by a single character,
 * and then tests whether the string starts with the character
 * 
 * GET String
 * GET character
 * COMPARE String[0] with character
 * IF String[0] == character
 * RETURN true
 */

import java.util.*;

public class Q3aStartStringTest {
	public static void main(String[] args) {
		
		String userString;
		char userChar;
		char firstChar;
		
		// ask user for inputs
		System.out.println("Please type in a string: ");
		userString = EasyScanner.nextString(); // use our new easy scanner class
		
		System.out.println("Please enter a character: ");
		userChar = EasyScanner.nextChar();
		
		// get first character of String
		firstChar = userString.charAt(0);
		
		// compare
		if (firstChar == userChar) {
			System.out.println("The first letter in the string is the same as the character: " + userChar);
		} else {
			System.out.println("They are not the same.");
		}
		
	}
}
