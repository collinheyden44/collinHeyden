package loops;

import java.util.Scanner;

public class Activity8For {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Whats your favorite number?");
		int num = input.nextInt();
		for(int counter = num; counter <= num * 50; counter += num) {
			System.out.println(counter);
			

		}
		
		System.out.println("The sum of these numbers is: " + num * 50);
		
	}

}
