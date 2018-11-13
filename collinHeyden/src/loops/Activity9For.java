package loops;

import java.util.Scanner;

public class Activity9For {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int num = 0;
		int sum = 0;
		for(int counter = 1; counter <= 5; counter ++) {
			System.out.println("Whats your number?");
			num = input.nextInt();
			sum += num;
			System.out.println(num);
		}
		
		System.out.println("The sum of your numbers is: " + sum);
		
	}

}
