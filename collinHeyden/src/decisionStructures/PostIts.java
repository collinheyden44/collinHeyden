package decisionStructures;

import java.util.Scanner;

public class PostIts{

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		final int postItArea = 3 * 3;
		int measure = 0;
		double length = -9999;
		double width = -9999;
		double area = -9999;
		double numPostit = -9999;
		
		System.out.println("Measurement in feet or inches? (0 = feet, 1 = inches)");
		measure = input.nextInt();
		System.out.println("Please enter length");
		length = input.nextDouble();
		System.out.println("Please enter width");
		width = input.nextDouble();
		
		if(measure == 0) {
			length = length * 12;
			width = width * 12;
		}
		
		area = length * width;
		System.out.println("The area to be covered = " + area);
		numPostit = area / postItArea;
		System.out.println("The number of post its needed = " + numPostit);
		
		input.close();
		
	}
	
}