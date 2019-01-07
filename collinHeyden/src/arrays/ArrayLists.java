package arrays;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayLists {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		ArrayList<String> bob = new ArrayList<String>();
		
		bob.add(0, "Bob");
		bob.add(1, "Jane");
		bob.add(2, "Billy");
		
		System.out.println("Please type in your first name");
		bob.add(input.nextLine());
		
		System.out.println(bob);
		
		for(int i = 0; i < bob.size(); i++) {
			System.out.println(bob.get(i));
		}
		
		input.close();

	}


}
