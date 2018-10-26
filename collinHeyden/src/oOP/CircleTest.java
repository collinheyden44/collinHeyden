package oOP;

public class CircleTest {

		public static void main(String [] args){

		Circle ball = new Circle();
		System.out.println("Ball radius: " + ball.getRadius());
		System.out.println("Ball circumference: " + ball.circumference());
		System.out.println("Ball area: " + ball.area());
		ball.setRadius(7.2);
		System.out.println("\n" + "Ball radius: " + ball.getRadius());
		System.out.println("Ball circumference: " + ball.circumference());
		System.out.println("Ball area: " + ball.area());
		ball = new Circle(12.25);
		System.out.println("\n" + "Ball radius: " + ball.getRadius());
		System.out.println("Ball circumference: " + ball.circumference());
		System.out.println("Ball area: " + ball.area());
		ball.setRadius(16.9);
		System.out.println("\n" + "Ball radius: " + ball.getRadius());
		System.out.println("Ball circumference: " + ball.circumference());
		System.out.println("Ball area: " + ball.area());

		}
}
