import java.util.*;
public class SomeProg {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int age, bornIn;
		final int YEAR = 2021;
		System.out.println("How old are you this year? "); 
		age = sc.nextInt();
		bornIn = YEAR - age;
		System.out.println("I think you were born in " + bornIn);
		
	}
	
}


/* Errors:
There were no " around the string on line 7
line 8 attempts to store a Double in an Int
line 9 uses an uppercase B for the variable BornIn
The program has not asked for the year, so does not know the value
*/