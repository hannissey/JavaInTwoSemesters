package chapter1_TheFirstStep;

/* BEGIN
	 * DISPLAY prompt for value in pounds.
	 * ENTER value in pounds.
	 * GET value to old value + 2.2;
	 * DISPLAY value in kilos.
 * END
 */

import java.util.*;

public class Conversion {
	public static void main(String[] args) {
		
		Scanner keyboardEntry = new Scanner(System.in);
		System.out.println("Welcome to our pounds to kilo converter!");
		System.out.println("Please enter the value in pounds.");
		double valueInPounds = keyboardEntry.nextDouble();
		double valueInKilos = valueInPounds + 2.2;
		System.out.println("The value in kilos is " + valueInKilos);
		
	}
}
