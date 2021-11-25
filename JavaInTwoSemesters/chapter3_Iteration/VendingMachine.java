package chapter3_Iteration;

import java.util.*;

public class VendingMachine {

	public static void main(String[] args) {
		int option, response, gumSold = 0, chocolateSold = 0, popcornSold = 0, juiceSold = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Vending Machine");

		do {
			//offer menu of options
			System.out.println("[1] Get gum ");
			System.out.println("[2] Get chocolate ");
			System.out.println("[3] Get popcorn ");
			System.out.println("[4] Get juice ");
			System.out.println("[5] Display total sold so far ");
			System.out.println("[6] Quit ");
			System.out.println("Enter choice: ");
			response = sc.nextInt();
			System.out.println();
			switch (response) {
			case 1 : System.out.println("Here is your gum ");
			gumSold += 1;
			break;
			case 2 : System.out.println("Here is your chocolate ");
			chocolateSold += 1;
			break;
			case 3 : System.out.println("Here is your popcorn ");
			popcornSold +=1;
			break;
			case 4 : System.out.println("Here is your juice ");
			juiceSold +=1;
			break;
			case 5 : System.out.println(gumSold + " items of gum sold. \n" + chocolateSold + " items of chocolate sold \n" + popcornSold + " items of popcorn sold \n" + juiceSold + " items of juice sold");
			}
			if (response < 1 || response > 6) {
				System.out.println("Error, Options 1-6 only! ");
			}			

		} while (response != 6);
		

	}
	
	
	
}
