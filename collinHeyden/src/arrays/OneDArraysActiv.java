package arrays;

import java.util.Scanner;

public class OneDArraysActiv {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		int numNames = 20;
		String[] names = new String[numNames];
		
		for(int i = 0; i < numNames; i++) {
			System.out.println("Type in name below:");
			names[i] = input.nextLine();
		}
		
		for(int j = 20; j >= 0; j--) {
			System.out.println(names[j]);
		}
		
		input.close();
	
	}

}
