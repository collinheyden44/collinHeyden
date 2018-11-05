package loops;

import java.util.Scanner;

public class Cube {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int cube = 999;
		
		while(cube != -1) {
			System.out.println("What is the number that you want to cube?");
			cube = input.nextInt();
			cube = cube * cube * cube;
			System.out.println("Your number cubed: " + cube);
			
		}
		
		System.out.println("Sorry, we cannot process -1" + "\n" + "* Program ended *");

	}

}
