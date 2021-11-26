package chapter5_arrays;

import java.util.*;
import java.util.Arrays;

public class Q5javaStudents {
	public static void main(String[] args) {
		int[] javaStudents = new int[10];
		getExamMarks(javaStudents);
		increaseMarks(javaStudents);
		boolean havePassed = allHavePassed(javaStudents);
		
		System.out.println(Arrays.toString(javaStudents));
		System.out.println(havePassed);
	}
	
	// method called getExamMarks
	// gets user input (exam grades as integers)
	// stores marks in array
	// returns array
	
	private static int[] getExamMarks(int[] examMarks) {
		for (int i = 0; i < examMarks.length; i++) {
			Scanner sc = new Scanner(System.in);
			System.out.println("Please enter the exam mark for Student " + (i+1));
			examMarks[i] = sc.nextInt();
		}
		return examMarks;
	}
	
	// method increaseMarks that accepts an array examMarks and increase + 5
	private static void increaseMarks(int[] increaseMarksBy5) {
		for (int i = 0; i < increaseMarksBy5.length; i++) {
			increaseMarksBy5[i] += 5;
		}
		System.out.println("All marks increased by 5");
	}
	
	// method allHavePassed accepts array examMarks and returns TRUE if all marks are greater than 40
	private static boolean allHavePassed(int[] allHavePassedTest) {
		for (int i = 0; i < allHavePassedTest.length; i++) {
			if (allHavePassedTest[i] > 40 || allHavePassedTest[i] == 40) {
				return true;
			} 
		}
		return false;
		
	}
}
