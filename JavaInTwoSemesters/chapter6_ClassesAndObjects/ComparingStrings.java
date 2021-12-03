package chapter6_ClassesAndObjects;

import java.util.*;

public class ComparingStrings {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String string1, string2;
		int comparison;
		
		// get two strings from the user
		System.out.println("Enter a string: ");
		string1 = sc.next();
		System.out.println("Enter another string: ");
		string2 = sc.next();
		
		//convert the strings to lower case (upper case will always trump lower case)
		string1 = string1.toLowerCase();
		string2 = string2.toLowerCase();
		
		// compare the strings
		comparison = string1.compareTo(string2);
		// because compareTo method returns an integer, we need to create an if statement to use
		// the integer to determine our result
		if (comparison < 0) {
			System.out.println(string1 + " comes before " + string2 + " in the alphabet.");
		} else if (comparison > 0) {
			System.out.println(string2 + " comes before " + string1 + " in the alphabet.");
		} else {
			System.out.println("The strings are identical.");
		}
	}
	
	
}
