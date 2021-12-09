package chapter4_ImplementingMethods;

import java.util.*;

public class FindCost5 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double price, tax;
		System.out.println("*** Product Price Check ***");
		System.out.println("Enter initial price: ");
		price = sc.nextDouble();
		System.out.println("Enter tax rate: ");
		tax = sc.nextDouble();
		
		//calling the method
		price = addTax(price, tax);
		
		System.out.println("Cost after tax = " + price );
		System.out.println(price);
		System.out.println("Actual cost after tax = " + addTax(price, tax));
	}
	
	private static double addTax(double priceIn, double taxIn) {
		return priceIn * (1 + taxIn/100);
	}

}
