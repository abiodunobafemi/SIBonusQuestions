// Abiodun Obafemi

import java.util.Scanner;
public class SISession2 {

	public static void main(String[] args) {
		
		// Declare Scanner
		Scanner input = new Scanner(System.in);

		// Input radius and length
		System.out.print("Enter the radius and length of a cylinder: ");
		double radius = input.nextDouble();
		double length = input.nextDouble();

		// Calculate area and volume
		double area = radius * radius * Math.PI;
		double volume = area * length;

		// Output
		System.out.println("The area is " + area);
		System.out.println("The volume of the cylinder is " + volume);
	}

}
