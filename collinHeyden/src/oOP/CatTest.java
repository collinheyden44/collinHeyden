package oOP;

public class CatTest {

	public static void main(String[] args) {
		Cat bob = new Cat();
		System.out.println("Age: " + bob.returnAge());
		System.out.println("Hours of Sleep: " + bob.returnSleep());
		bob = new Cat(9, 8);
		System.out.println("\n" + "Age: " + bob.returnAge());
		System.out.println("Hours of Sleep: " + bob.returnSleep());
		bob.sleepLess();
		System.out.println("\n" + "Age: " + bob.returnAge());
		System.out.println("Hours of Sleep: " + bob.returnSleep());
		bob.birthday();
		System.out.println("\n" + "Age: " + bob.returnAge());
		System.out.println("Hours of Sleep: " + bob.returnSleep());
		bob.sleepMore();
		bob.sleepMore();
		System.out.println("\n" + "Age: " + bob.returnAge());
		System.out.println("Hours of Sleep: " + bob.returnSleep());
	}

}
