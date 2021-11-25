/* BEGIN
 * DISPLAY basic system 375.99
 * CONFIRM cost
 * SELECT 38cm screen at 75.99 OR 43cm screen at 99.99
 * PRESENT optional extras
 * SELECT optional extras
 * DISPLAY final cost
 * END
 */



import java.util.*;

public class ComputerOrderSystem2 {
	public static void main(String[] args) {
		
		String response, response2;
		int screenSize;
		double basicSystem = 375.99, screen38 = 75.99, screen43 = 99.99, dvdCdWriter = 65.99, printer = 125.00; 
		double totalCost = 0.00;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Hello customer! Would you like to buy a computer? Please type yes or no ");
		response = sc.nextLine();
		
		if (response.equals("yes")) {
			System.out.println("Thank you! Our basic system costs £ " + basicSystem);
			totalCost = totalCost + basicSystem;
			System.out.println("What size screen would you like? You can have 38 inches. Please type size.");
			screenSize = sc.nextInt();
			if (screenSize == 38) {
				System.out.println("Excellent choice sir - a 38 inch screen will be £75.99 ");
				totalCost = totalCost + screen38;	
				System.out.println("We also have these optional extras available, a DVD/CD Writer and a printer. Are you interested? ");
				response = sc.nextLine();
				if (response.equals("yes")) {
					System.out.println("Would you like the DVD/CD writer at an additional cost of £65.99? ");
					response = sc.nextLine();
					if (response.equals("yes")) {
						System.out.println("I will add that to your package. Would you also like our Printer? ");
						totalCost = totalCost + dvdCdWriter;
						response = sc.nextLine();
						if (response.equals("yes")) {
							System.out.println("Great, the printer will be an additional " + printer);
							totalCost = totalCost + printer;
							System.out.println("You have chosen our Premium Package, which features the basic system at £" + basicSystem + ", 38 inch screen at £" + screen38 + " DVD/CD writer at £" + dvdCdWriter + " and printer at £" + printer + ". Your total cost comes to £" + totalCost);
						}
						else {
							System.out.println("No problem at all. The total cost will be " + totalCost );
						}
					}
					else {
						System.out.println("Ok sir, would you like the Printer instead? ");
						response = sc.nextLine();
						if (response.equals("yes")) {
							System.out.println("Great, the printer will be an additional " + printer);
							totalCost = totalCost + printer;
							System.out.println("Your total cost comes to " + totalCost);
						}
						else {
							System.out.println("No problem at all. The total cost will be " + totalCost );
						}
					}
				}
				else {
					System.out.println("No problem at all. You have chosen our basic system, which is £"
							+ basicSystem + " with the 38 inch screen at £" + screen38 + ", and no additional extras. The total cost will be £" + totalCost );
				}
			}
			else {
					System.out.println("test No problem at all. The total cost will be " + totalCost );
			}
		}
			else {
				System.out.println("I'm sorry, we do not have that screen size available. ");
			}
	}
}
