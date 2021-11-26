package chapter5_arrays;

public class Q4dNewArray {
	
	public static void main(String[] args) {
	// explicit creation of array
	//int[] someArray = {2,5,1,9,11};
	
	// Creating the above array using the New operator
	int[] someArray = new int[5];
	
	someArray[0] = 2;
	someArray[1] = 5;
	someArray[2] = 1;
	someArray[3] = 9;
	someArray[4] = 11;
	
	// write a standard for loop that will double every item in someArray
	for (int i = 0; i < someArray.length; i++) {
		someArray[i] *= 2;
		System.out.println(someArray[i]);
	}
	
	// explain why we could not have used an enhanced for loop for the previous task
	// because we needed to access and amend every item in the array, a enhanced for loop can only
	// read items
	
	System.out.println(); // whitespace for readability
	
	// enhanced for loop below for comparison
	for (int item : someArray) {
		System.out.println(item);
	}
	
	
	
	}
	
	
	
}
