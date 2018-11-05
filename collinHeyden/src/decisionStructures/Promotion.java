package decisionStructures;

import java.util.Scanner;

public class Promotion {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		double close = .1;
		boolean promotion = false;
		System.out.println("How old are you?");
		int age = input.nextInt();
		System.out.println("How many years of experience do you have?");
		double experience = input.nextDouble();
		System.out.println("What is your height (in inches)?");
		int height = input.nextInt();

		if (age >= 50) {
			if (experience - Math.abs(10.5) < close) {
				if (height > 80 || height < 70) {
					promotion = true;
				}
			}
		} else {
			if (height > 70 && height < 80) {
				promotion = true;
			}
		}

		System.out.println("You get a promotion: " + promotion);
		
		input.close();

	}

}
