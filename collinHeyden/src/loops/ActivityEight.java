package loops;

import java.util.Scanner;

public class ActivityEight {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		
		
		double sum = 0;
		int count = 0;
		System.out.println("Please enter double values (ex. 3.2) that you want to find the average for");
		System.out.println("When you are done, please type 1");
		
		System.out.println("Double #: ");
		double num = input.nextDouble();
		
		
		while(num != 1) {
			System.out.println("Double #: ");
			num = input.nextDouble();
			sum += num;
			count ++;
		}
		
		System.out.println(sum / count);

		input.close();

	}

}
