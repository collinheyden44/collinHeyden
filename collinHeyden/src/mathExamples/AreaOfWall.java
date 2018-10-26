package mathExamples;

import java.util.Scanner;

public class AreaOfWall {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		double wallArea = -999.9;
		System.out.println("The wall is 8 feet tall?");
		System.out.println("What is the width of the wall (In feet)?");
		wallArea = input.nextInt() * 8.0;
		System.out.println("The area of the wall is " + wallArea + " square feet");
		
	}

}	
	
