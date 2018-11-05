package decisionStructures;

import java.util.Scanner;

public class Weight {
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("1: Mercury");
		System.out.println("2: Venus");
		System.out.println("3: Mars");
		System.out.println("4: Jupiter");
		System.out.println("5: Saturn");
		System.out.println("");
		System.out.print("Planet: ");
		int choice = input.nextInt();
		System.out.println("Weight: ");
		double weight = input.nextDouble();
		
		switch(choice) {
		case 1:
			weight *= .37;
			break;
		case 2:
			weight *= .88;
			break;
		case 3:
			weight *= .38;
			break;
		case 4:
			weight *= 2.64;
			break;
		case 5:
			weight *= 1.15;
			break;
		}
		
		System.out.println("Your weight will be " + weight);
		
		input.close();
		
	}
	
}