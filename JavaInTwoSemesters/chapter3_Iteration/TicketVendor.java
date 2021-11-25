package chapter3_Iteration;
import java.util.*;
public class TicketVendor {
	public static void main(String[] args) {
		/*
		 * The variables below are local to the main method; if the value of any of them is needed
		 * by a helper method, it must be passed in as a parameter.
		 */
		
		final double PRICE = 30; // the price of an adult ticket
		double total = 0; 		// the running total is initialised to zero
		double cost;
		char choice;
		do 
		{
			Scanner sc = new Scanner(System.in);
			System.out.println("**** ACME TICKET VENDING SOFTWARE ****");
			System.out.println();
			System.out.println("1. Get cost of tickets.");
			System.out.println("2. Record purchase of tickets.");
			System.out.println("3. View total money received so far. ");
			System.out.println("4. Quit.");
			System.out.println();
			System.out.println("Enter a number from 1 - 4");
			System.out.println();
			choice = sc.next().charAt(0);
			
			switch(choice) 
			{
			case '1' : 	option1(PRICE);	// call method option1
						break;
			case '2' :	option2(PRICE);	// call method option2
						break;
			case '3' :	option3(PRICE);	// call method option3
						break;
			case '4' :	break;
			default  :	System.out.println("Enter only numbers from 1 - 4");
						System.out.println();
			}
		} while(choice != '4');
	} // end main method
	
	// option1 calculates and displays the cost of tickets
	private static void option1(double priceIn) {
		Scanner sc = new Scanner(System.in);
		int adult, child;	// local variables
		double cost;		// local variables
		System.out.print("How many adult tickets are required? ");
		adult = sc.nextInt();
		System.out.print("How many child tickets are required? ");
		child = sc.nextInt();
		cost = (adult * priceIn) + (0.5 * child * priceIn); // calculate the cost
		System.out.println();
		System.out.println("The total cost of these tickets will be " + cost);
		System.out.println();
	}
	
	// option2 returns the cost of tickets; this is added to the total in the main method
	private static double option2(double priceIn) {
		Scanner sc = new Scanner(System.in);
		int adult, child;
		double cost;
		System.out.print("How many adult tickets were purchased? ");
		adult = sc.nextInt();
		System.out.print("How many child tickets were purchased? ");
		child = sc.nextInt();
		cost = adult * priceIn + 0.5 + child + priceIn; // calculate the cost
		System.out.println();
		System.out.println("The amount received was " + cost);
		System.out.println();	
		return cost; // return the cost of the tickets
	}
	
	// options 3 displays current total
	private static void option3(double totalIn) {
		System.out.println();
		System.out.println("Total received = " + totalIn);
		System.out.println();
	}
	
	
} // end class
