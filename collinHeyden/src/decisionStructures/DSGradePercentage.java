package decisionStructures;

import java.util.Scanner;

public class DSGradePercentage {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Grade Percentage Calculator 1.0" + "\n\n");
		System.out.println("***  Use percentages - Ex. 89.3  ***" + "\n");
		System.out.println("What is your first grade?");
		double grade1 = input.nextDouble();
		System.out.println("\n" + "What is your second grade?");
		double grade2 = input.nextDouble();
		System.out.println("\n" + "What is your third grade?");
		double grade3 = input.nextDouble();
		System.out.println("\n" + "Did you do extra credit? Type either true or false");
		boolean extraCredit = input.nextBoolean();
		
		
		if(extraCredit == true) {
			System.out.println("\n" + "How many extra credit points did you earn?");
			double extraCreditPoints = input.nextDouble();
			System.out.println("\n" + "Your Grade Percentage is: " + ((grade1 + grade2 + grade3 + extraCreditPoints) / 3));
		}
		
		else {
			System.out.println("\n" + "Your grade percentage is: " + ((grade1 + grade2 + grade3) / 3));
		}
		
		input.close();
		
	}
}
