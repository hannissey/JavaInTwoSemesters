package chapter3_Iteration;

/*
 * Pseudocode for validating input
 * 
 * DISPLAY prompt for mark
 * ENTER mark
 * KEEP REPEATING WHILE mark < 0 OR mark > 100
 * BEGIN
 * 	DISPLAY error message to user
 * 	ENTER mark
 * END
 * ...REST OF PROGRAM HERE
 */

import java.util.*;

public class DisplayResult3 {
	public static void main(String[] args) 
	{
		int mark;
		Scanner sc = new Scanner(System.in);
		System.out.println("What exam mark did you get? "); // display prompt for mark
		mark = sc.nextInt();
		
		while (mark < 0 || mark > 100) // check for invalid input
		{
			// display error message and allow for re-input
			System.out.println("Invalid mark: re-enter! ");
			mark = sc.nextInt();
		}
		
		if (mark >= 40)
		{
			// executed when test is true
			System.out.println("Congratulations, you passed! ");
		}
		else 
		{
			// executed when test is false
			System.out.println("I'm sorry, but you've failed.");
		}
		System.out.println("Good luck with your other exams.");
	}
}
