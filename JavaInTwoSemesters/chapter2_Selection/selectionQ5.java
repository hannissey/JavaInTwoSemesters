package chapter2_Selection;
import java.util.*;

public class selectionQ5 {
	public static void main(String[] args) {
		int x;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number: ");
		x = sc.nextInt();
		if (x > 10) {
			System.out.println("Green"); // only prints when x is greater than 10 (true)
		}
		else {
			System.out.println("Blue"); // only prints when x is less than or equal to 10 (false)
		}
		System.out.println("Red"); // red should print regardless
		
		System.out.println("Well done Hannah :)");
	}
}

// if user enters 10, output will be blue and red CORRECT!
// if user enters 20, output will be green and red CORRECT!