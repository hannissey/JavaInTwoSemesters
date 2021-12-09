package chapter5_arrays;

public class ArrayAverage {
	public static void main(String[] args) {
		int[] someArray = {5,4,8,9,10,7};
		average(someArray);
		averageOrMore(someArray);
	}
	
	private static int average (int[] arrayIn) {
		int total = 0;
		for (int i = 0; i < arrayIn.length; i++) {
			total = (total + arrayIn[i]);
		}
		total = total / arrayIn.length; // equals 7
		return total;
	}
	
	private static void averageOrMore(int[] arrayIn) {
		int average = average(arrayIn);
		System.out.println("The average is: " + average);
		for (int i = 0; i < arrayIn.length; i++) {
			if (arrayIn[i] <= average) {
				System.out.println("This value is greater than or equal to the average: " + arrayIn[i]);
			}
		}
	}
}
