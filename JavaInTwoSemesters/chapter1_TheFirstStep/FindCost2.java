package chapter1_TheFirstStep;


public class FindCost2 {
	
	//fields
	double price, tax;
	
	//constructor
	public FindCost2(double total, double taxAmount) {
		price = total;
		tax = taxAmount;
	}
	
	//method
	public double calculateCost() {
		price = price * (1 + tax/100);
		return price;
	}

	//main method
	public static void main(String[] args) {
		
		FindCost2 findcost = new FindCost2(500, 17.5);
		findcost.calculateCost();
		System.out.println("*** Product Price Check ***");
		System.out.println("Cost after tax = " + findcost);

	}
	
	//toString method
	public String toString() {
		return "Cost after tax = " + price + ".";
		
	}

}
