package chapter4_ImplementingMethods;

/*
 * BEGIN
 * DISPLAY menu options
 * GET menu option
 * 
 * option 1
 * GET temperature in celsius
 * CONVERT celsius to farenheit
 * DISPLAY temperature in farenheit
 * 
 * option 2
 * GET temperature in farenheit
 * CONVERT farenheit to celsius
 * DISPLAY temperature in celsius
 * 
 * option 3
 * QUIT program
 * 
 * END
 */

import java.util.*;

public class CelsiusToFarenheit {
	
	public static void main(String[] args) 
	{
	
	double temp;
	char menuOption;
	Scanner sc = new Scanner(System.in);
	
	do {
		System.out.println("*** Welcome to our temperature converter! ***");
		System.out.println("Please select an option: ");
		System.out.println("[1] Convert temperature from Celsius to Farenheit ");
		System.out.println("[2] Convert temperature from Farenheit to Celsius ");
		System.out.println("[3] Quit program ");
		menuOption = sc.next().charAt(0);
		
			switch(menuOption) {
				case '1' : 
					System.out.println("Please enter the temperature in Celsius: ");
					temp = sc.nextDouble();
					if (temp < 273.15) {
						System.out.println("Sorry, we cannot accept numbers below absolute zero. ");
						System.out.println("Please enter the temperature in Celsius: ");
						temp = sc.nextDouble();
					}
					System.out.println("The temperature in Farenheit is " + celsiusToFarenheit(temp));
				break;
				case '2' :
					System.out.println("Please enter the temperature in Farenheit: ");
					temp = sc.nextDouble();
					if (temp < 459.67) {
						System.out.println("Sorry, we cannot accept numbers below absolute zero. ");
						System.out.println("Please enter the temperature in Farenheit: ");
						temp = sc.nextDouble();
					}
					System.out.println("The temperature in Celsius is " + farenheitToCelsius(temp));
				break;
				case '3' :
					System.out.println("Thank you, goodbye now. ");
				break;
			}
			
	} while (menuOption != '3');
	
	
	} // end main method
	
	private static double celsiusToFarenheit(double tempIn) {
		// To convert temperatures in degrees Celsius to Fahrenheit, multiply by 1.8 and add 32.
		double result = tempIn * 1.8 + 32;
		return result;
	}
	
	private static double farenheitToCelsius(double tempIn) {
		// subtract 32 and multiply by . 5556
		double result = (tempIn - 32) * .5556;
		return result;
	}
}
