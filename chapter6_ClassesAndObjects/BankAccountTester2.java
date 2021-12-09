package chapter6_ClassesAndObjects;

public class BankAccountTester2 {
	public static void main(String[] args) {
		// create an array of references
		BankAccount[] accountList = new BankAccount[4];
		
		// create 3 new accounts referenced by each element in the array
		accountList[0] = new BankAccount("99786754", "Susan Richards");
		accountList[1] = new BankAccount("44567109", "Delroy Jacobs");
		accountList[2] = new BankAccount("46376205", "Sumana Khan");
		accountList[3] = new BankAccount("45781524", "Hannah Banana");
		
		// make various deposits and withdrawals
		accountList[0].deposit(1000);
		accountList[2].deposit(150);
		accountList[0].withdraw(500);
		accountList[3].deposit(704.99);
		
		// print details of all three accounts
		for (BankAccount item : accountList) {
			System.out.println("Account Number: " + item.getAccountNumber());
			System.out.println("Account Name: " + item.getAccountName());
			System.out.println("Current Balance: " + item.getBalance());
			System.out.println();
		}
	}
}
