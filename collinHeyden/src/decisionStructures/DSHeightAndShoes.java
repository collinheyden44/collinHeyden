package decisionStructures;

import java.util.Scanner;

public class DSHeightAndShoes {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("What is your height in inches?");
		double height = input.nextDouble();
		System.out.println("What is your shoe size?");
		double shoeSize = input.nextDouble();
		
		System.out.println(height < 62 && shoeSize > 9); 
		
		}
}
