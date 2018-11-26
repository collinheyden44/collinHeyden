package loops;

import java.util.Random;

public class RandomClass {

	public static void main(String[] args) {
		
		Random generator = new Random();
		
		int min = 0;
		int max = 100;
		
		int randomNum = min + generator.nextInt(max -  min + 1);
		
		System.out.println("A random number between " + min + " and " + max + " is: " + randomNum);

	}

}
