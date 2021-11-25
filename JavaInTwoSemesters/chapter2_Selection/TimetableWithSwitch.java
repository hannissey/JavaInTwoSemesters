package chapter2_Selection;
import java.util.*;

public class TimetableWithSwitch {
	public static void main(String[] args)
	{
		char group;
		Scanner keyboardInput = new Scanner(System.in);
		System.out.println("*** Lab Times ***");
		System.out.println("Enter your group (A, B, C or D)");
		group = keyboardInput.next().charAt(0);
		switch(group) // beginning of switch, applied to char group variable
		{
			case 'A' : case 'D' :	System.out.println("10.00 am");
						break;
			case 'B' :	System.out.println("1.00 pm");
						break;
			case 'C' :	System.out.println("11.00 am");
						break;
			default	:	System.out.println("No such group.");	
		} // end of switch
	}
}
