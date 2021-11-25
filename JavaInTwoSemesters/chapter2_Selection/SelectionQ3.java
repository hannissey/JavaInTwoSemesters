package chapter2_Selection;
import java.util.*;

public class SelectionQ3 {
	public static void main(String[] args) {
		double price = 9.99;
		int age;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your age ");
		age = sc.nextInt();
		
		// code to reduce ticket price for children goes here
		if (age < 14) price = 3.99;
		
		System.out.println("Ticket price = " + price);
	}
}
