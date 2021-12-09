package chapter6_ClassesAndObjects;

import java.util.*;

/* Design and implement a program that performs the following:
 * when the program starts 2 x bank accounts are created, using names & numbers written into the code
 * the user is asked to enter an account number, 
 * followed by an amount to deposit in that account
 * the balance of the appropriate account is then updated accordingly
 * if an incorrect account number is entered an error message displays
 * user is asked if they wish to make more deposits
 * if yes, repeat the process
 * if no, display details of both accounts
 */

public class BankAccountDebugging {
	
	public static void main(String[] args) {
		
	String response;
	// create an array of references using the BankAccount class
	BankAccount[] myAccounts = new BankAccount[2]; 

	
	// store details of accounts in the array
	myAccounts[0] = new BankAccount("853", "Hannah's Current Account");
	myAccounts[1] = new BankAccount("854", "Hannah's Savings Account");
	
	do {
	System.out.println("Please enter account number: ");
	String accountNumberIn = EasyScanner.nextString();
		
	for (BankAccount item : myAccounts ) {
		String test = item.getAccountNumber();
		System.out.println("this is the value being passed" + test);
			if (test.equals(item.getAccountNumber())) {
				System.out.println("Please enter amount you wish to deposit in account number " + accountNumberIn);
				double depositIn = EasyScanner.nextDouble();
				// add deposit in to balance
				//test.deposit(depositIn);
				//System.out.println("Your balance in " + test + " is now: " + test.getBalance());
				System.out.println("Is it doing what it needs to now.");
			} else {
				System.out.println("Account number not recognised. ");
				break;
			}		
	}
	
	
	
	System.out.println("Would you like to make more deposits? Yes or No");
	response = EasyScanner.nextString();
	System.out.println(response);
	} while (response.equalsIgnoreCase("yes"));
	
	System.out.println("Please see your account details below: ");
	for (BankAccount item : myAccounts) {
		System.out.println();
		System.out.println("Account Number: " + item.getAccountNumber());
		System.out.println("Account Name: " + item.getAccountName());
		System.out.println("Account Balance: " + item.getBalance());
		System.out.println();	
	}
	

	
	System.out.println("Thank you and goodbye. ");

	
	
	}
	
	// choice 4: checks whether a value requested from user is in the array
	private static boolean contains (Object[] arrayIn, String valueIn) {
		for (Object currentElement : arrayIn) {
			if (currentElement == valueIn) {
				return true;
			}
		}
		return false;
	}
	
	// choice 6: display array values on screen 
	public static void displayArray (Object[] arrayIn) {
		System.out.println();
		// standard for loop used as array index is required
		for (int i = 0; i < arrayIn.length; i++) {
			System.out.println("array[" + i + "] = " + arrayIn[i]);
		}
	}
	

}
