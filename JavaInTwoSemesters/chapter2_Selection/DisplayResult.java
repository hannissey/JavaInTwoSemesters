package chapter2_Selection;

import java.util.*;

public class DisplayResult {
	public static void main(String[] args) 
	{
		int mark;
		Scanner sc = new Scanner(System.in);
		System.out.println("What exam mark did you get? ");
		mark = sc.nextInt();
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
