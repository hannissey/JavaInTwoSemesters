package chapter1_TheFirstStep;
import java.util.*;

public class StringTest {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String name; //declaration of a string
		int age;
		System.out.print("What is your name? ");
		name = sc.next(); // the next method is for String input
		System.out.print("What is your age? ");
		age = sc.nextInt();
		System.out.println();
		System.out.println("Hello " + name);
		// now comes the joke!
		System.out.println("When I was your age I was " + (age + 1));
	}
}

