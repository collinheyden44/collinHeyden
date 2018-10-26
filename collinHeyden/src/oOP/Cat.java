package oOP;

public class Cat {

	private int age;
	private int sleep;
	
	public Cat() {
		age = 12;
		sleep = 12;
	}
	
	public Cat(int newAge, int newSleep) {
		age = newAge;
		sleep = newSleep;
	}
	
	public void birthday() {
		age = age + 1;
	}
	
	public void sleepMore() {
		sleep = sleep + 1;
	}
	
	public void sleepLess() {
		sleep = sleep -1;
	}
	
	public int returnAge() {
		return age;
	}
	
	public int returnSleep() {
		return sleep;
	}
	
}
