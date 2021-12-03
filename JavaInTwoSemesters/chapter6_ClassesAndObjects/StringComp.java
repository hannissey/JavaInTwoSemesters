package chapter6_ClassesAndObjects;

import java.util.*;

public class StringComp {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String string1, string2;
		
		// get two strings from user
		System.out.println("Enter your password: ");
		string1 = sc.next();
		System.out.println("Confirm your password: ");
		string2 = sc.next();
		
		//remove whitespace
		string1.trim();
		string2.trim();
		
		// compare the strings
		
		if (string1.equalsIgnoreCase(string2)) {
			System.out.println("Logging you in.");
			}
		else {
			System.out.println("Your passwords do not match.");
		}
		
	
	}

}
