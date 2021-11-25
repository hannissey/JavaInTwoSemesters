package chapter3_Iteration;

import java.util.*;

public class IterationQ2 {
	
	public static void main(String[] args) {
		int num;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number: ");
		num = sc.nextInt();
		for(int i = 1; i < num; i++) {
			System.out.println("YES");
			System.out.println("NO");
		}
		System.out.println("OK");
	}

}

/*
 * If the user enter 5 when prompted, the output would be:
 * YES
 * NO
 * YES
 * NO
 * YES
 * NO
 * YES
 * NO
 * OK
 * 
 * If the user entered 0 when prompted, the output would be:
 * 
 * OK
 * */
