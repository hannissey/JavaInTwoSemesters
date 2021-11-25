package chapter5_arrays;

import java.util.*;

public class TemperatureReadings {
	public static void main(String[] args) {
		// declare 7 variables to hold readings
		double temperature1 = 0, temperature2 = 0, temperature3 = 0, temperature4 = 0, temperature5 =0, temperature6 = 0, temperature7 = 0;
		// more code will go here
		double[] temperature; // DECLARING tell Java we are creating an array called someArray
		temperature = new double[7]; // ALLOCATING tell Java the memory required for the array will be 10 double variables
		// declaring and allocating can also be combined into 1 step
		// commented out as duplicate causes error // double[] temperature = new double[7];
		
		Scanner sc = new Scanner(System.in);
		
		for (int i = 0; i <= 7; i++) {
			System.out.println("Max temperature for day " + i + "? ");
			temperature1 = sc.nextDouble(); // how do we get the input for a different variable within a for loop?
		}
		
		System.out.println("Monday's temperature was " + temperature1);
		System.out.println("Tuesday's temperature was " + temperature2); // from here on the entered temp hasn't been stored
		System.out.println("Wednesday's temperature was " + temperature3);
		System.out.println("Thursday's temperature was " + temperature4);
		System.out.println("Friday's temperature was " + temperature5);
		System.out.println("Saturday's temperature was " + temperature6);
		System.out.println("Sunday's temperature was " + temperature7);
	}
	

}



