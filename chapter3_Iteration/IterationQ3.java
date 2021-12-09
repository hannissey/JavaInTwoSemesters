package chapter3_Iteration;

public class IterationQ3 {
	
	public static void main(String[] args) {
		for(int i = 1; i <=10; i++) {
			if (i % 2 == 0) {
				System.out.println(i + " is even ");
			}
			else {
				System.out.println(i + " is odd ");
			}
		}
	}

}

// only the even numbers (divisible by 2) would be output.