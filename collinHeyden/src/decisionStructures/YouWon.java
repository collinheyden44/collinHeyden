package decisionStructures;

import java.util.Scanner;

public class YouWon {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		double change = .1;
		System.out.println("How much money did you recieve on your fifth birthday?");
		double money = input.nextDouble();
		
		if(Math.abs(money - Math.sqrt(84.3)) < change) {
			System.out.println("\n" + "You have won a good prize!");
		}
		
		else {
			System.out.println("\n" + "You have won a bad prize! Sorry!");
		}
		
		input.close();
		
	}
}
