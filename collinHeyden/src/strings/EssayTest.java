package strings;

public class EssayTest {

	public static void main(String[] args) {
		Essay bob = new Essay();
		bob.setName("Collin Heyden");
		bob.setText("Hello, my name is Collin Heyden and I like pizza and naked juice");
		System.out.println("Authors last name: " + bob.lastName());
		System.out.println("Number of letters in the authors first name: " + bob.firstName());
		System.out.println("The letter \"x\" is in the authors name: " + bob.authorNameContainsX());
		System.out.println("Number of words in the essay: " + bob.numberOfWords());
		
	}
	
}
