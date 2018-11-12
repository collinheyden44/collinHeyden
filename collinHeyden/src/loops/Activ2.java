package loops;

import java.util.Scanner;

public class Activ2 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter a number");
		int num = input.nextInt();
		
		do {
			System.out.println("Magic Number: " + Math.pow(num, 5));
			System.out.println("Please enter a Number (9999 to quit)");
			num = input.nextInt();
		}
		while(num != 9999);

		input.close();
	}

}
