package loops;

import java.util.Scanner;

public class Activity11For {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int num = 0;
		int sum = 0;
		for(int counter = 1; counter <= 5; counter ++) {
			System.out.println("Whats your number?");
			num = input.nextInt();
			sum += num;
			
			if(num % 2 == 1) {
				System.out.println("Odd");

			}
			else {
				System.out.println("Even " + num);
			}
			
		}
	
		if(sum % 2 == 1) {
			System.out.println("The sum of your numbers is: Odd " + sum);

		}
		else {
			System.out.println("The sum of your numbers is: Even " + sum);
		}
		
	}

}
