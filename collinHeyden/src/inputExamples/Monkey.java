package inputExamples;

import java.util.Scanner;

public class Monkey {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		int age = -999;
		System.out.println("What is your age?");
		age = input.nextInt();
		System.out.println("Your age is " + age);
		
	}

}
