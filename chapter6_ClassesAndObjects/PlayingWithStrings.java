package chapter6_ClassesAndObjects;

import java.util.*;

public class PlayingWithStrings {
	public static void main(String[] args) {
		
		// Constructor that creates and empty string
		String string1; // declare object
		string1 = new String(); // create object
		
		// it's more usual to combine these into one statement
		// this line does two things: names an object (str) and creates space in memory for it
		String string2 = new String();
		// same as the Scanner class
		Scanner sc = new Scanner(System.in);
		
		// even more useful constructor, which gives the value at the same time as creation
		String string3 = new String("Hello!");
		
		// because the assignment operator is overloaded, we can use it to create a new string
		// the String class is the only class that allows us to create new objects without using 'new'
		String string4 = "Hello";
	}
}
