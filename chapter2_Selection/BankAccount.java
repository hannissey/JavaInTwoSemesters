package chapter2_Selection;

/* Create a bank account program that enables users to enter an amount of money
 * and see how much interest can be earned on that amount of money in one year.
 * Use a switch statement.
 */

import java.util.*;

public class BankAccount {
	public static void main(String[] args) {
		char account;
		
		double interestA = 1.5, interestB = 2, interestC = 1.5, interestX = 5;
		double money;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Hello investor! How much money would you like to invest?");
		money = sc.nextDouble();
		System.out.println("Which account would you like to invest in? ");
		account = sc.next().charAt(0);
		
		switch (account) {
		case 'A' : case 'C' : 
			if (money >= 250) {
				System.out.println("You will be investing £" + money + " at a rate of " + interestA + "%. You will earn £" + Math.round(money * interestA / 100.0));
			}
			else {
				System.out.println("I'm sorry, you need a minimum investment of £250.");
			}

		break;
		case 'B' : 
			if (money >= 1000) {
				System.out.println("You will be investing £" + money + " at a rate of " + interestB + "%. You will earn £" + Math.round(money * interestB / 100.0));
			}
			else {
				System.out.println("I'm sorry, you need a minimum investment of £1000.");
			}
		break;
		case 'X' : 
		if (money >= 5000) {
			System.out.println("You will be investing £" + money + " at a rate of " + interestX + "%. You will earn £" + Math.round(money * interestX / 100.0));
		}
		else {
			System.out.println("I'm sorry, you need a minimum investment of £5000.");
		}		
		break;
		default : System.out.println("Sorry, we do not offer that account. ");
		}
	}
}
