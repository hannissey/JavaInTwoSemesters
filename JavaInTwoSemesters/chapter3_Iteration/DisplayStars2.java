package chapter3_Iteration;

import java.util.*;

public class DisplayStars2 {
	public static void main(String[] args) {
		int num;
		char reply;
		Scanner sc = new Scanner(System.in);
		do {
			System.out.println("Size of square? ");
			num = sc.nextInt();
			while (num < 2 || num > 100) {
			System.out.println("Number must be between 2 and 100 ");
			num = sc.nextInt();
			}
			for (int i = 1; i <= num; i++) {
				for (int j = 1; j <= num; j++) {
					System.out.print("*");
				}
			System.out.println();
			}
			//see if user wants another go
			System.out.println("Would you like another go? y/n");
			reply = sc.next().charAt(0);
			System.out.println();
		} while (reply == 'y' || reply == 'Y');
	}
}
