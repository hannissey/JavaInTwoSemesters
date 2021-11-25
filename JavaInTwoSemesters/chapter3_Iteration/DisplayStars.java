package chapter3_Iteration;

import java.util.*;

public class DisplayStars {
	public static void main(String[] args) {
		int num;
		Scanner sc = new Scanner(System.in);
		System.out.println("Size of square? ");
		num = sc.nextInt();
		for (int i = 1; i <= num; i++) {
			for (int j = 1; j <= num; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
