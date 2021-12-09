package chapter4_ImplementingMethods;

public class MethodsQ5 {
	public static void main(String[] args) {
		System.out.println(myMethod(3, 5));
		System.out.println(myMethod(3, 5, 10));
		// System.out.println(myMethod(3)); // not applicable for the arguments (missing parameters)
		// System.out.println(myMethod(3, 5.7, 10)); // not applicable for the arguments
	}
	
	private static int myMethod(int firstIn, int secondIn, int thirdIn) {
		return firstIn + secondIn + thirdIn;
	}
	
	private static int myMethod(int firstIn, int secondIn) {
		return firstIn - secondIn;
	}
}

// this program should output - 2 and 18
// whats the difference between an argument and a parameter?
// Parameters are local variables which are assigned value of the arguments when the function is called.