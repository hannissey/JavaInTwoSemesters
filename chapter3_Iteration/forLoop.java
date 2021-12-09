package chapter3_Iteration;

public class forLoop {
	public static void main(String[] args) {
		for(int i = 0; i <= 5; i++) {
			for (int j = 0; j<=5; j++) {
				System.out.print("*");
			}
			System.out.println("This will print after each iteration of the inner loop.");
		}
		System.out.println("This should print AFTER the outer loop.");
	}

}
