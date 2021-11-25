package chapter4_ImplementingMethods;

import java.util.*;

/* a program to input the initial price of a product and then calculate and display its cost after tax has been added. */

public class FindCost4 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double price, tax;
		System.out.println("*** Product Price Check *** ");
		System.out.println("Enter initial price: ");
		price = sc.nextDouble();
		System.out.println("Enter tax rate: ");
		tax = sc.nextDouble();
		System.out.println("Cost after tax = " + price); 
	}
	
	public static double addTax(double priceIn, double taxIn) {
		return priceIn * (1 + taxIn/100);
	}
}
