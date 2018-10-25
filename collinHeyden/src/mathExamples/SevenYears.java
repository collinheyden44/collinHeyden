package mathExamples;

import java.util.Scanner;

public class SevenYears {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		int age = -999;
		System.out.println("How old are you?");
		age = input.nextInt() + 7;
		System.out.println("In seven years, you will be " + age + " years old");
		input.close();
		
	}

}
