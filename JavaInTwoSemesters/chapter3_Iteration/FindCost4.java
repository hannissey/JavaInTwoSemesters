package chapter3_Iteration;

import java.util.*;

public class FindCost4 {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double price, tax;
		char reply;
		do
		{
			System.out.println("*** Product Price Check ***");
			System.out.print("Enter initial price: "); //prompt for input
			price = sc.nextDouble(); // input method called
			System.out.print("Enter tax rate: "); //prompt for input
			tax = sc.nextDouble(); //input method called
		
				// the following 'if' statement allows a selection to take place
				if (price > 100) // test the price to see if a discount can be applied
				{
					// these two instructions execute only when the test is true
					System.out.println("Special Promotion! Your tax will be halved.");
					tax = tax * 0.5;
				}
		price = price * (1 + tax/100); //perform the calculation
		System.out.println("Cost after tax = " + price);
		// now see if the user wants another go!
		System.out.println();
		System.out.println("Would you like to enter another product, y/n? ");
		reply = sc.next().charAt(0);
		System.out.println();
		
		} while (reply == 'y' || reply == 'Y');
		System.out.println("Thank you, have a nice day. ");
	}

}
