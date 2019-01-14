package arrays;

import java.util.ArrayList;
import java.util.Scanner;

public class WrapperClassActivity1 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		ArrayList<Integer> ages = new ArrayList<Integer>();
		
		System.out.println("How many students do you want to record?");
		int record = input.nextInt();
		
		int count = 1;
		
		for(int i = 0; i < record; i++) {
			System.out.println("Student " + count + " age:");
			ages.add(input.nextInt());
			count++;
		}
		
		int sum = 0;
		
		for(int y : ages) {
			sum += y;
		}
		
		System.out.print("Student ages:");
		for(int agesList : ages) {
			System.out.println(agesList);
		}
		
		System.out.println("Average of ages: " + (sum / record));
		
		input.close();

	}

}
