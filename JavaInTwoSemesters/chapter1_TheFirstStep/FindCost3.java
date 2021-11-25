package chapter1_TheFirstStep;

import java.util.*;

public class FindCost3 {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double price, tax;
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
	}

}
