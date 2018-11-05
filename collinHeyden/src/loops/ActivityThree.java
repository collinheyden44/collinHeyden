package loops;

import java.util.Scanner;

public class ActivityThree {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("What number do you want to find the positive multiples of 2 for?");
		int num = input.nextInt();
		int count = 0;
		System.out.println("List of Positive multiples of 2 for " + num + "\n");
		
		while(count <= num) {
			System.out.println(count);
			count += 2;
		}
		
		input.close();

	}

}
