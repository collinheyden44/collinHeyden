package strings;

import java.util.Scanner;

public class Activity13Strings {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		System.out.println("Please tyoe in your social security number (example: 123-45-6789)");
		String sSN = input.nextLine();

		System.out.println(sSN.substring(7, 11));
		System.out.println(sSN.substring(4, 6));
		System.out.println(sSN.substring(0, 3));
		input.close();
	}

}
