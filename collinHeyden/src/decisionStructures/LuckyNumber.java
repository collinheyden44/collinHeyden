package decisionStructures;

import java.util.Scanner;

public class LuckyNumber {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Are you an adult or a kid? (Type 1 for adult and 2 for kid)");
		int adultKid = input.nextInt();
		
		if(adultKid == 1) {
			System.out.println("\n" + "What is your height (in inches)?");
			int height = input.nextInt();
			System.out.println("\n" + "Lucky Number: " + (height * 5));
		}
		
		else {
			System.out.println("What is your weight (in pounds)?");
			int weight = input.nextInt();
			System.out.println("\n" + "Lucky Number: " + (weight / 2));
		}
		
		input.close();
		
	}
}
