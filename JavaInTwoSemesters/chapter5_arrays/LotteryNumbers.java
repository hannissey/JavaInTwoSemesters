package chapter5_arrays;

import java.util.Scanner;
import java.util.Arrays;

//Design and implement a program that initialises an array of integers with a collection of
//6 winning lottery numbers. Allow the user to enter their 6 lottery numbers into another array.
//The program should compare the two arrays and tell the user if they have won the lottery or not.
//To win the lottery the user must have the same 6 winning lottery numbers but they might not
//necessarily be in the same order. Make use of methods in your program - one to allow the user to
//enter their lottery numbers and another to check if the user has won the lottery.

public class LotteryNumbers {
	public static void main (String[] args) {
		int[] winningNumbers = {56, 73, 40, 85, 2, 14};
		int[] userNumbers = getPlayerNumbers();
		System.out.println(userNumbers); // only shows memory address
		displayNumbers(userNumbers); // display user's lottery numbers
		displayNumbers(winningNumbers); // display winning lottery numbers
		
		boolean hasWon = compareNumbers(winningNumbers, userNumbers);
		if (hasWon) {	
			System.out.println("You've won!");
		} else {
			System.out.println("Sorry, you lose.");
		}
	}

// helper methods
	
	// get user's chosen lottery numbers
	private static int[] getPlayerNumbers() {
		Scanner sc = new Scanner(System.in);
		int[] playerNumbers = new int[6]; // declare new empty array
		
		for (int i = 0; i < playerNumbers.length; i++) {
			System.out.println("Enter " + (i+1) + " number: "); // request numbers from user
			playerNumbers[i] = sc.nextInt();
		}
		return playerNumbers;
	}
	
	// display array values
	private static void displayNumbers(int[] numbersIn) {
		System.out.println();
		// enhanced for loop
		for (int number : numbersIn) {
			System.out.println(number);
		}
	}
	
	// compare two arrays
	private static boolean compareNumbers(int[] firstArray, int[] secondArray) {
		for (int i = 0; i < firstArray.length; i++) {
			if (firstArray[i] == secondArray[i]) {
					return true;
				}
			}
		return false;
		}
	
	
}
