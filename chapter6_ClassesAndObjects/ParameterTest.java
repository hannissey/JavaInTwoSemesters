package chapter6_ClassesAndObjects;

public class ParameterTest {
	public static void main(String[] args) {
		BankAccount testAccount = new BankAccount("678", "Elton John");
		test(testAccount);
		System.out.println();
		System.out.println("Account Number: " + testAccount.getAccountNumber());
		System.out.println("Account Name: " + testAccount.getAccountName());
		System.out.println("Account Balance: " + testAccount.getBalance());
		System.out.println();	
	}
	
	// a method that makes a deposit in the bank account
	private static void test(BankAccount accountIn) {
		accountIn.deposit(2000);
	}
}
