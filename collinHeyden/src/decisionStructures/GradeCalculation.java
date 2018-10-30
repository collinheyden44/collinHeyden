package decisionStructures;

import java.util.Scanner;

public class GradeCalculation {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("What is your test average?");
		double test = input.nextDouble();
		System.out.println("What is your homeowrk average?");
		double homework = input.nextDouble();
		System.out.println("Is your teacher nice? (Type either 1 for nice or 2 for not nice)");
		int question = input.nextInt();
		
		if(question == 1) {
			if(test > homework) {
				System.out.println("Your grade in this class is: " + test);
			}
			else {
				System.out.println("Your grade in this class is: " + homework);
			}
		}
		else if(question == 2) {
			if(test < homework) {
				System.out.println("Your grade in this class is: " + test);
			}
			else {
				System.out.println("Your grade in this class is: " + homework);
			}
		}
		else {
			System.out.println("You did not type 1 or 2. Please restart the program and start over.");

		}

	}

}
