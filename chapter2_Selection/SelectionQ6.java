package chapter2_Selection;
import java.util.*;

public class SelectionQ6 {
	public static void main(String[] args) {
		int x;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number: ");
		x = sc.nextInt();
		switch (x)
		{
		case 1 : case 2 : System.out.println("Green"); 
		break;
		case 3 : case 4 : case 5 : System.out.println("Blue");
		}
		System.out.println("Well done Hannah!!");
	}
}

/* Answers
 * a) Output would be Green CORRECT!
 * b) Output would be Green CORRECT!
 * c) Output would be Blue CORRECT!
 * d) Output would be numbers 1-5 only CORRECT!
 * e) Nothing. CORRECT!
 * */
