package chapter4_ImplementingMethods;

public class FindSquare {

	public static void main(String[] args) {
		int a = 12;
		int b = 9;
		
		int x = max(a,b);
		int y = square(b);
		
		
		
		System.out.println(max(2100,567,3));
		
		

	}
	
	private static int square (int numberIn) {
		return numberIn * numberIn;
	}
	
	private static int max(int firstIn, int secondIn) {
		if(firstIn > secondIn) {
			return firstIn;
		}
		else {
			return secondIn;
		}
	}
	
	/*
	 * we want to find the greatest of 3 integers
	 * 
	 * BEGIN
	 * GET 3 integers
	 * CREATE result variable
	 * STORE first integer in result variable
	 * COMPARE first integer with second integer
	 * STORE largest in variable
	 * COMPARE largest with third integer
	 * STORE largest in variable
	 * 
	 * 
	 */
	
	private static int max(int firstIn, int secondIn, int thirdIn) {
		int result = firstIn;
		if (secondIn > result) {
			result = secondIn;
		}
		if (thirdIn > result) {
			result = thirdIn;
		}
		return result;
	}
	
	private static boolean isEven(int numberIn) {
		return numberIn % 2 == 0;
	}
}
