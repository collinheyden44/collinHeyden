package decisionStructures;

import java.util.Scanner;

public class CostofInsurance {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int age = -999;
		int weight = -9999;
		int smoke = 0;
		double total = 200;
		System.out.println("Please enter your age");
		age = input.nextInt();
		System.out.println("Please enter your weight");
		weight = input.nextInt();
		System.out.println("Do you smoke? (0 = false, 1 = true):");
		smoke = input.nextInt();
		
		if(age > 75) {
			total = total + 125;
		}

		if(age < 30) {
			total = total - 25;
		}
		
		if(weight >= 700) {
			total = total + 300;
		}
		
		if(smoke == 1) {
			total = total + 50;
		}
		else {
			total = total - 40;
		}
		
		System.out.println("Your insurance bill is $" + total);

		input.close();
		
	}		
}