package loops;

public class ActivityTwo {

	public static void main(String[] args) {
		int count = 0;
		System.out.println("List of Positive multiples of 2 for 100,000" + "\n");
		
		while(count <= 100000) {
			System.out.println(count);
			count += 2;
		}

	}

}
