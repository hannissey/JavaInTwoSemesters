package chapter4_ImplementingMethods;

public class MethodsQ7 {
	public static void main(String[] args) 
	{
		int x = 2;
		int y = 7;
		System.out.println(myMethod(x, y)); // this will output 11;
		System.out.println(y); // this will output 7
	}
	
	private static int myMethod(int a, int x) // 2, 7
	{
		int y = 20;
		return y - a - x; // 20 - 2 - 7 = 11
	}
}
