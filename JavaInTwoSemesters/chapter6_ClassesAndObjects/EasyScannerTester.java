package chapter6_ClassesAndObjects;

// we have had to create the EasyScanner class in a separate file, however if this is in the same
// package the program can access it

public class EasyScannerTester {
	public static void main(String[] args) {
		System.out.println("Enter a double: ");
		double d = EasyScanner.nextDouble();
		System.out.println("You entered: " + d);
		System.out.println();
		
		System.out.println("Enter a number: ");
		int i = EasyScanner.nextInt();
		System.out.println("You entered: " + i);
		System.out.println();
		
		System.out.println("Enter a string: ");
		String s = EasyScanner.nextString();
		System.out.println("You entered: " + s);
		System.out.println();
		
		System.out.println("Enter a character: ");
		char c = EasyScanner.nextChar();
		System.out.println("You entered: " + c);
		System.out.println();
	}
	
	

}


