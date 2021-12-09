package chapter5_arrays;

import java.util.*;

public class TemperatureReadings2 {
	
	public static void main(String[] args) {
		//Scanner sc = new Scanner(System.in);
		// create array
		double[] temperature = new double[7];
		enterTemps(temperature); // call helper method - when sending array as a parameter you only need to use the array name
		displayTemps(temperature); // call helper method
		
		// below code is commented out as two tasks have been turned into a helper methods

		//enter temperatures 
//		for (int i = 0; i < temperature.length; i++) {
//			System.out.println("Enter max temperature for day " + (i+1));
//			temperature[i] = sc.nextDouble();
//		} // end for loop
		
		//display temperatures
//		System.out.println(); // blank line
//		System.out.println("*** TEMPERATURES ENTERED ***");
//		for (int i = 0; i < temperature.length; i++) {
//			System.out.println("Day " + (i + 1) + " " + temperature[i]);
//		}
	}
	
	// helper method to enter temperatures
	private static void enterTemps( double[] temperatureIn ) {
		for (int i = 0; i < temperatureIn.length; i++) {
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter max temperature for day " + (i + 1));
			temperatureIn[i] = sc.nextDouble();
		}
	}
	
	// helper method to display temperatures
	private static void displayTemps( double[] temperatureIn ) {
		System.out.println();
		System.out.println("*** TEMPERATURES ENTERED ***");
		for (int i = 0; i < temperatureIn.length; i++) {
			System.out.println("Day " + (i + 1) + " " + temperatureIn[i]);
		}
	}
}
