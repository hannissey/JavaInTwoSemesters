package chapter4_ImplementingMethods;

import java.util.*;

public class CalculateArea {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Input radius of circle ");
		double radius = sc.nextDouble();
		System.out.println("The area of the circle with a radius of " + radius + " is " + areaCircle(radius));
		
	}
	
	private static double areaCircle(double radiusIn) {
		// pi r squared
		double area;
		area = 3.142 * (radiusIn * radiusIn);
		return area;
	}
}
