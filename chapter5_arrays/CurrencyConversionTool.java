package chapter5_arrays;

/* Design and implement a program that:
 * 1. Allows user to enter price of 5 products & store in array
 * 2. program should copy this array into another array, converting the price of each product
 * from pounds Sterling to US dollars.
 * 3. The user should be able to enter the exchange rate, and
 * 4. should display the contents of both arrays
 * 
 * Algorithm:
 * 
 * BEGIN
 * CREATE empty array
 * GET user values in pounds sterling to populate array
 * GET user value exchange rate
 * COPY sterling values into new array, converting into US dollars using given rate
 * DISPLAY values of both arrays
 * END
 */

import java.util.*;

public class CurrencyConversionTool {
	
	public static void main(String[] args) {

		int numberOfProducts = getProductNo();
		double[] productPrices = new double[numberOfProducts];
		double[] productPricesNew = new double[numberOfProducts];
		getProductPrices(productPrices);
		// exchangeRate(); moved to inside method
		convertProductPrices(productPrices, productPricesNew);
		System.out.println("Prices in British Sterling: ");
		displayProductPrices(productPrices);
		System.out.print("£");
		displayTotalValue(productPrices);
		System.out.println("Prices in US Dollars: ");
		displayProductPrices(productPricesNew);
		System.out.print("$");
		displayTotalValue(productPricesNew);
	}
	
	// get user's product prices
	private static double[] getProductPrices(double[] productPricesIn) {
		for (int i = 0; i < productPricesIn.length; i++) {
			Scanner sc = new Scanner(System.in);
			System.out.println("Please enter Product " + (i+1) + " Price in £: ");
			productPricesIn[i] = sc.nextDouble();
		}
		return productPricesIn;
	}
	
	// request how many products user wishes to purchase
	private static int getProductNo() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter amount of products you wish to buy: ");
		int productNumber = sc.nextInt();
		return productNumber;
	}
	
	// get user's exchange rate
//	private static double exchangeRate() {
//		Scanner sc = new Scanner(System.in);
//		System.out.println("Please enter exchange rate: ");
//		double exchangeRateIn = sc.nextDouble();
//		return exchangeRateIn;
//	}
	
	// get user's exchange rate & convert into US dollars
	private static void convertProductPrices(double[] productPricesIn, double[] productPricesNewIn) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter exchange rate: ");
		double exchangeRateIn = sc.nextDouble();
		for (int i = 0; i < productPricesIn.length; i++) {
			productPricesNewIn[i] = productPricesIn[i] * exchangeRateIn;
		}
	}
	
	// display array
	private static void displayProductPrices(double[] productPricesIn) {
		for (double price : productPricesIn) {
			System.out.println(price);
		}
	}
	
	// total of values in array
	private static void displayTotalValue(double[] productPricesIn) {
		double total = 0;
		for (double item : productPricesIn) {
			total = total + item;
		}
		System.out.println("Total: " + total);
		//return total;
	}

}
