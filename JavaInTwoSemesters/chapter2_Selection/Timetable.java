package chapter2_Selection;

import java.util.*;

public class Timetable {
	
	public static void main(String[] args)
	{
		//create variables for use in the program
		char group; // this stores the tutorial group
		
		Scanner keyboardInput = new Scanner(System.in);
		System.out.println("*** Lab Times ***");
		System.out.println("Enter your group (A, B or C)");
		group = keyboardInput.next().charAt(0);
		// check tutorial group and display appropriate time.
		if (group == 'A')
		{
			System.out.print("10.00am");
		}
		else if (group == 'B')
			{
				System.out.print("1.00pm");
			}
			else if (group == 'C')
				{
					System.out.print("11.00am");
				}
				else
				{
					System.out.print("No such group.");
				}
	
	}

}
