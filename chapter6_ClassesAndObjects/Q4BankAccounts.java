package chapter6_ClassesAndObjects;

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

public class Q4BankAccounts {
	
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
	
	for (int i = 0; i < myAccounts.length; i++ ) {
		if (accountNumberIn.equals(myAccounts[i].getAccountNumber())) {
			System.out.println(myAccounts[i].getAccountNumber());
			System.out.println(accountNumberIn.equals(myAccounts[i].getAccountNumber()));
			System.out.println("Please enter amount you wish to deposit in account number " + accountNumberIn);
			double depositIn = EasyScanner.nextDouble();
			
			// add deposit in to balance
			myAccounts[i].deposit(depositIn);
			
			System.out.println("Your balance in " + myAccounts[i].getAccountName() + " is now: " + myAccounts[i].getBalance());
			break; // fixes when entering 853, but not 854
		} else {
			System.out.println(myAccounts[i].getAccountNumber());
			System.out.println(accountNumberIn.equals(myAccounts[i].getAccountNumber()));
			System.out.println("Account number not recognised. ");
		}		
	}
	
	System.out.println("Would you like to make more deposits? Yes or No");
	response = EasyScanner.nextString();
	System.out.println(response);
	} while (response.equalsIgnoreCase("yes"));
	
	System.out.println("Please see your account details below: ");
	for (int i = 0; i < myAccounts.length; i++) {
		System.out.println();
		System.out.println("Account Number: " + myAccounts[i].getAccountNumber());
		System.out.println("Account Name: " + myAccounts[i].getAccountName());
		System.out.println("Account Balance: " + myAccounts[i].getBalance());
		System.out.println();	
	}
	
	System.out.println("Thank you and goodbye. ");

	
	
	}
	
	

}
