package decisionStructures;

import java.util.Scanner;

public class DSAge {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("What is your age?");
		int age = input.nextInt();
		
		if(age <= 17) {
			System.out.println("Your getting an A in this class.");
			System.out.println("I hope you have a great day!");
		}
		else {
			System.out.println("I hope you have a great day!");
		}
		
		}
}
