package loops;

import java.util.Scanner;

public class Activ3 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		
		System.out.println("Enter a number");
		int num = input.nextInt();
		int max = 0;
		int min = 0;
		
		do {
			if(num > max ) {
				max = num;
			}
			
			if(num < min) {
				min = num;
			}
			
			System.out.println("Please enter a Number (9999 to quit)");
			num = input.nextInt();
		}
		while(num != 9999);
		
		System.out.println("The Range of the Numbers You Entered is: " + (max - min));

		input.close();
	}

}
