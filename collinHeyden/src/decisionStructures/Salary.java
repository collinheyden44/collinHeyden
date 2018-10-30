package decisionStructures;

import java.util.Scanner;

public class Salary {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("How much money do you make a year?");
		int money = input.nextInt();
		
		if(money > 20000 ) {
			if(money > 40000) {
				if(money > 100000)  {
					System.out.println("You are an owner");

				}
				else {
					System.out.println("You are a CEO");

				}
				
			} 
			else {
				System.out.println("You are a Manager");

			}
		}
		else {
			System.out.println("You are a worker");
		}

	}

}
