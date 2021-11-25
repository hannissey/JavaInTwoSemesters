package chapter3_Iteration;

import java.util.Scanner;

public class SixTimesTable {
	public static void main(String[] args) {
		
//		int num;
//		Scanner sc = new Scanner(System.in);
//		System.out.println("Which times table would you like to view? ");
//		num = sc.nextInt();
//		
//		for (int i = 1; i <=12; i++) {
//			System.out.println(i + " x " + num + " = " + (i * num));
//		}
		
		int num;
		int i = 1;
		Scanner sc = new Scanner(System.in);
		System.out.println("Which times table would you like to view? ");
		num = sc.nextInt();
		
		while (i <=12) {
			System.out.println(i + " x " + num + " = " + (i * num));
			i++;
		}		
		
		
		
	}
}
