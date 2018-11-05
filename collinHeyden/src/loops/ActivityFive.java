package loops;

import java.util.Scanner;

public class ActivityFive {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int num = -999;
		int numTwo = -999;
		
		
		while(num != 9999) {
			System.out.println("What number do you want to multiply by 2?");
			num = input.nextInt();
			numTwo = num * 2;
			System.out.println(num + " * 2 = " + numTwo);
		}
		
		System.out.println("Sorry, we cannot process 9999");
		System.out.println("* Program Ended *");
		input.close();

	}

}
