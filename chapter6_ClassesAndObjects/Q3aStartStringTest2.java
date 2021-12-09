package chapter6_ClassesAndObjects;

/* ADD ignore case to original program
 * have created a new program as initial essentially works, but want to explore other options
 * 
 * Write a program that asks the user to input a string, followed by a single character,
 * and then tests whether the string starts with the character
 * 
 * GET String
 * GET character
 * COMPARE String[0] with character
 * IF String[0] == character
 * RETURN true
 */

// import java.util.*; not needed as we are using our own EasyScanner class

public class Q3aStartStringTest2 {
	public static void main(String[] args) {
		
		String userString;
		String userChar;
		String firstLetter;
		
		// ask user for inputs
		System.out.println("Please type in a string: ");
		userString = EasyScanner.nextString(); // use our new easy scanner class
		
		System.out.println("Please enter a character: ");
		userChar = EasyScanner.nextString();
		
		firstLetter = userString.substring(0,1);
		
		// compare
		if (userChar.equalsIgnoreCase(firstLetter)) {
			System.out.println("The first letter in the string is the same as the character: " + userChar);
		} else {
			System.out.println("They are not the same.");
		}
		
		// Debugging
		System.out.println(userString);
		System.out.println(userChar);
		System.out.println(firstLetter);
		
	}
}
