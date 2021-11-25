
/* 
 * BEGIN
 * GET first number
 * GET second number
 * GET guess at result
 * IF guess = correct then congratulate the user
 * IF guess = incorrect display commiseration message and result
 * END
 */

import java.util.*;

public class GuessSum {

	public static void main(String[] args) {
		int firstNumber, secondNumber, guess, result;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Hello, welcome to our magical guessing game! ");
		System.out.println("Please enter your first number ");
		firstNumber = sc.nextInt();
		System.out.println("Please enter your second number ");
		secondNumber = sc.nextInt();
		System.out.println("Now enter your guess at the result! ");
		guess = sc.nextInt();
		result = firstNumber + secondNumber;
		
		if (result == guess) {
			System.out.println("Congratulations! You are right. ");
		}
		else {
			System.out.println("Sorry, no dice! The correct answer is " + result);
		}
	}
	
}
