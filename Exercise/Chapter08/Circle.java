package Exercise.Chapter08;

public class Circle extends Shape {
	private double radius;
	
	public Circle(double radius) {
		this.radius = radius;
	}
	
	public double area() {
		return radius * radius * Math.PI;
	}
	
	public double perimeter() {
		return 2 * Math.PI * radius;
	}
	
	public String toString() {
		return String.format("도형의 종류: 원, 둘레: %.2fcm, 넓이: %.2f㎠", perimeter(), area());
	}
}
