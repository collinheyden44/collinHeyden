package loops;

import java.util.Scanner;

public class Activity1For {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("How many hellos do you want?");
		int num = input.nextInt();
		for(int counter = 1; counter <= num; counter++) {
			
			System.out.println(counter + " Hello");
		}

	}

}
