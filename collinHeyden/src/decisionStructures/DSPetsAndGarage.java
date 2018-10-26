package decisionStructures;

import java.util.Scanner;

public class DSPetsAndGarage {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("How many pets are in your house?");
		int pets = input.nextInt();
		System.out.println("How many cars can fit in your garage?");
		int cars = input.nextInt();
		
		System.out.println(pets >= 2 && cars > 3);
			
	}

}
