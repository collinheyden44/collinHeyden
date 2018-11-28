package strings;

import java.util.Scanner;

public class Activity3String {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("What is name 1?");
		String name1 = input.nextLine();

		System.out.println("What is name 2?");
		String name2 = input.nextLine();

		System.out.println(name1.compareTo(name2));
		
		input.close();
		
	}

}
