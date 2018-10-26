package oOP;

public class Greeter {
	
	private int age;
	
	public Greeter() {
		age = 98;
	}
	
	public int getAge() {
		return age;
	}
	
	public void setAge(int newAge) {
		age = newAge;
	}
	
	
	public void sayHello() {
		System.out.print("Hello");
	}
	
}
