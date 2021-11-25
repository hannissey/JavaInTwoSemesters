package chapter3_Iteration;

import java.util.*;

public class TimetableWithLoop {
	public static void main(String[] args) {
		char group, response;
		Scanner sc = new Scanner(System.in);
		System.out.println("***Lab Times***");
		do // put code in loop 
		{
			//offer menu of options
			System.out.println(""); // create a blank line
			System.out.println("[1] TIME FOR GROUP A ");
			System.out.println("[2] TIME FOR GROUP B ");
			System.out.println("[3] TIME FOR GROUP C ");
			System.out.println("[4] QUIT PROGRAM ");
			System.out.println("enter choice [1, 2, 3, 4]: ");
			response = sc.next().charAt(0); // get response
			System.out.println();
			switch(response) {
			case '1' : System.out.println("10.00 am");
			break;
			case '2' : System.out.println("1.00 pm");
			break;
			case '3' : System.out.println("11.00am");
			break;
			case '4' : System.out.println("Goodbye ");
			break;
			default : System.out.println("Options 1-4 only. ");
			
			}
			
		} while (response != '4'); // test for quit option
			
	}
}
