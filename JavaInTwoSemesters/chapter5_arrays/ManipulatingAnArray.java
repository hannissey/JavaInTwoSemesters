package chapter5_arrays;

import java.util.*;

public class ManipulatingAnArray {

	public static void main (String[] args) {
		char choice;
		Scanner sc = new Scanner(System.in);
		int[] someArray; // declare an integer array
		System.out.print("How many elements to store?: ");
		int size = sc.nextInt();
		// size the array
		someArray = new int [size];
		
		//menu
		
		// start do while statement (to keep program running until user exits)
		// switch statement is contained within do while statement
		do {
			System.out.println();
			System.out.println("[1] Enter values"); // enter values into array
			System.out.println("[2] Array maximum"); // find the maximum value in array
			System.out.println("[3] Array sum"); // calculate the value of all values in an array
			System.out.println("[4] Array membership"); // determine whether array contains a particular value
			System.out.println("[5] Array search"); // determine the position of an item in the list
			System.out.println("[6] Display values");
			System.out.println("[7] Return average from array values");
			System.out.println("[8] Exit");
			System.out.print("Enter choice [1-8]: ");
			choice = sc.next().charAt(0);
			System.out.println();
			
			// switch statement which calls helper method depending on choice
			switch(choice) {
			case '1' :
				fillArray(someArray); // call fillArray method on someArray
				break;
			case '2' :
				int max = max(someArray); // stores result of max method in max variable
				System.out.println("Maximum array value = " + max);
				break;
			case '3':
				int total = sum(someArray); // assigns result of calling sum on SomeArray to total
				System.out.println("Sum of array values = " + total);
				break;
			case '4' :
				System.out.print("Enter value to find: ");
				int value = sc.nextInt();
				boolean found = contains(someArray, value); // stores the result of contains method in found
				if (found) {
					System.out.println(value + " is in the array.");
				} else {
					System.out.println(value + " is not in the array.");
				}
				break;
			case '5' :
				System.out.print("Enter value to find: ");
				int item = sc.nextInt();
				int index = search(someArray, item);
				if (index == -999) {
					System.out.println("This value is not in the array.");
				} else {
					System.out.println("This value is at array index " + index);
				}
				break;
			case '6' :
				System.out.println("Array values");
				displayArray(someArray);
				break;	
			case '7' :
				System.out.println("Array values average");
				average(someArray);
				break;
			}
		} while (choice !='8');
		System.out.println("Goodbye."); // last line of main method
	
	}
	
	// helper methods
	
	//choice 1: fills array with values
	private static void fillArray(int[] arrayIn) {
		Scanner sc = new Scanner(System.in);
		for (int i = 0; i < arrayIn.length; i++) {
			System.out.println("Enter value: ");
			arrayIn[i] = sc.nextInt();
		}
	}
	
	// choice 2: returns the maximum value in the array 
	private static int max (int[] arrayIn) {
		int result = arrayIn[0];
		for (int currentElement : arrayIn) {
			if (currentElement > result) {
				result = currentElement;
			}
		}
		return result;
	}
	
	// choice 3: returns total of all values in array
	private static int sum (int[] arrayIn) {
		int total = 0;
		for (int currentElement : arrayIn) {
			total = total + currentElement;
		}
		return total;
	}
	
	// choice 4: checks whether a value requested from user is in the array
	private static boolean contains (int[] arrayIn, int valueIn) {
		for (int currentElement : arrayIn) {
			if (currentElement == valueIn) {
				return true;
			}
		}
		return false;
	}
	
	// choice 5: returns the position of a value in an array (what number in the queue you are)
	// returns -999 if value not present in array (error code?)
	private static int search (int[] arrayIn, int valueIn) {
		for (int i = 0; i < arrayIn.length; i++) {
			if (arrayIn[i] == valueIn) {
				return i;
			}
		}
		return -999;
	}
	
	// choice 6: display array values on screen 
	public static void displayArray (int[] arrayIn) {
		System.out.println();
		// standard for loop used as array index is required
		for (int i = 0; i < arrayIn.length; i++) {
			System.out.println("array[" + i + "] = " + arrayIn[i]);
		}
	}
	
	// choice 7: returns total of all values in array
	private static void average (int[] arrayIn) {
		int total = 0;
		for (int i = 0; i < arrayIn.length; i++) {
			total = (total + arrayIn[i]);
		}
		System.out.println(total / arrayIn.length);
	}
	
}
