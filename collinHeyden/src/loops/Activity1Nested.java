package loops;

public class Activity1Nested {

	public static void main(String[] args) {
		
		for(int counter1 = 1; counter1 <= 4; counter1++) {
			for(int counter2 = 1; counter2 <= 5; counter2++) {
				System.out.print((counter1 * counter2) + "   ");
			}
			System.out.println(" ");
		}

	}

}
