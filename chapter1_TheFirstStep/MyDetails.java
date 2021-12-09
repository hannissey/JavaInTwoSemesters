package chapter1_TheFirstStep;
import java.util.*;

public class MyDetails {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String name, address;
		int tel;
		System.out.print("What is your name? ");
		name = sc.next(); // the next method is for String input
		System.out.print("Where do you live? ");
		address = sc.next(); // the next method is for String input
		System.out.print("What is your telephone number? ");
		tel = sc.nextInt();
		System.out.println();
		System.out.println("Hello " + name);
		System.out.println();
		System.out.println("Hannah's details are " + " \n" + address + " \n" + tel);
	}


}
