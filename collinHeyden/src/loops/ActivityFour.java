package loops;

import java.util.Scanner;

public class ActivityFour {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("What number do you want to find the positive multiples of 2 for?");
		int sum = 0;
		int num = input.nextInt();
		int count = 0;
		System.out.println("List of Positive multiples of 2 for " + num + "\n");
		
		while(count <= num) {
			sum += count;
			count += 2;
		}
		
		System.out.println(sum);
		input.close();

	}

}
