package chapter4_ImplementingMethods;

public class ParameterDemo {
	public static void main(String[] args) {
		int x = 10;
		demoMethod(x);
		System.out.println("This will be 10 = " + x);
	}
	
	public static void demoMethod(int xIn) {
		xIn = 25;
		System.out.println("This will be 25 = " + xIn);
	}
}

// this program shows that methods do not affect the variables they use as parameters.
