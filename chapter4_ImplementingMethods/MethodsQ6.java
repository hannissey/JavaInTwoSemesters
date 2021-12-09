package chapter4_ImplementingMethods;

public class MethodsQ6 {
	public static void main(String[] args) {
		int x = 3;
		int y = 4;
		System.out.println(myMethod(x, y)); // this will output 17
		System.out.println(y); // this will output 4
	}
	
	private static int myMethod(int firstIn, int secondIn) // actual parameters 3, 4 copied on to formal parameters 
	{
		int x = 10;
		int y;
		y = x + firstIn + secondIn; // this expression evaluates to 10 + 3 + 4
		return y; // 17
	}
}
