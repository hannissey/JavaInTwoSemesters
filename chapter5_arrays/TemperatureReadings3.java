package chapter5_arrays;

import java.util.*;

public class TemperatureReadings3 {
	
	public static void main(String[] args) {
		double[] temperature;
		temperature = enterTemps(); 
		displayTemps(temperature);
	}
	
	// this method receives no parameter but returns an array of doubles
	private static double[] enterTemps() {
		Scanner sc = new Scanner(System.in);
		// create an array within this method
		double[] temperatureOut = new double[7];
		// fill up the array created within this method REMEMBER TO ALWAYS USE A UNIQUE REF TO OBJECT IN METHODS
		for (int i = 0; i < temperatureOut.length; i++) {
			System.out.println("Enter max temperature for day " + (i + 1));
			temperatureOut[i] = sc.nextDouble();
		}
		return temperatureOut;
	}
	
	private static void displayTemps(double[] temperatureIn) {
		System.out.println();
		System.out.println("*** TEMPERATURES ENTERED ***");
//		for (int i = 0; i < temperatureIn.length; i++) {
//			System.out.println("day " + (i + 1) + " " + temperatureIn[i]);
//		}
		// enhanced for loop, also known as foreach loop
		for (double item : temperatureIn) System.out.println(item);
	}

}
