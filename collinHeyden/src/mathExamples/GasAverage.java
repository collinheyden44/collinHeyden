package mathExamples;

import java.util.Scanner;

public class GasAverage {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		int distance = -999;
		int mpg = -999;
		int gasMoney = -999;
		int gallonsUsed = -999;
		int averageCostGas = -999;
		System.out.println("How far did you travel (nearest mile)?");
		distance = input.nextInt();
		System.out.println("What was the fuel economy of your car (nearest MPG)?");
		mpg = input.nextInt();
		System.out.println("What was the total amount of money you soent on gas (nearest dollar)?");
		gasMoney = input.nextInt();
		gallonsUsed = distance / mpg;
		averageCostGas = gasMoney / gallonsUsed;
		System.out.println("Total distance traveled: " + distance);
		System.out.println("Gallons of gas used: " + gallonsUsed);
		System.out.println("Total amount of money used on gas: " + gasMoney);
		System.out.println("average cost per gallon of gas: " + averageCostGas);
		
	}

}

		