package decisionStructures;

import java.util.Scanner;

public class MathCalculator {
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		double a = 0;
		double b = 0;
		double c = 0;
		int menu_choice = 0;
		System.out.println("What is the first number?");
		a = input.nextInt();
		System.out.println("What is the second number?");
		b = input.nextInt();
		System.out.println("Please choose the number corresponding to the operation your wish to perform." );
		System.out.println("1. Addition");
		System.out.println("2. Subtraction");
		System.out.println("3. Multiplication");
		System.out.println("4. Division");
		System.out.println("5. Squaring the first");
		System.out.println("6. First to the Second's Power.");
		menu_choice = input.nextInt();
		
		switch (menu_choice) {
		case 1:
			c = (a + b);
			break;
		case 2:
			c = (a - b);
			break;
		case 3:
			c = (a * b);
			break;
		case 4:
			c = (a / b);
			break;
		case 5:
			c = (a * a);
			break;
		case 6:
			c = Math.pow(a, b);
			break;
		default:
			System.out.println("You did not select a choice from the menu.");
			break;}
		
		System.out.println("The result of your operation is "+ c + '.');
		
		input.close();
		 
	}
	
}