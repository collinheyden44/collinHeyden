package mathExamples;

import java.util.Scanner;

public class ChangeMaker {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		double changeFor = -999.99;
		double afterDollar = -999.99;
		double afterQuarter = -999.99;
		double afterDime = -999.99;
		double afterNickel = -999.99;
		double afterPenny = -999.99;
		System.out.println("What amount do you need change for?");
		changeFor = input.nextDouble();
		System.out.println("\n" + "Change for " + changeFor);
		input.close();
		
	}

}
		

		