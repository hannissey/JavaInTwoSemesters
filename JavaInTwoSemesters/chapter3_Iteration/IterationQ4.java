package chapter3_Iteration;

import java.util.*;

public class IterationQ4 {
	public static void main(String[] args) {
		final int SECRET = 321;
		int num;
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number: ");
		num = sc.nextInt();
		while (num != SECRET)
		{
			System.out.println("Wrong number, try again. ");
			num = sc.nextInt();
		} 
		System.out.println("Well done, right number! ");
	}
	
//	public static void main(String[] args) {
//		final int SECRET = 321;
//		int num;
//		Scanner sc = new Scanner(System.in);
//		System.out.print("Enter a number: ");
//		num = sc.nextInt();
//		
//		while (num < 321 || num > 321) {
//			System.out.println("Wrong number, try again. ");
//			num = sc.nextInt();
//		}
//		if (num == 321) // don't need if statement! {
//			System.out.println("Well done, right number! ");
//		}
//
//	}
}

