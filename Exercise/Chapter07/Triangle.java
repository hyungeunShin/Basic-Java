package Exercise.Chapter07;

public class Triangle extends Shape {
	private double side;
	
	public Triangle(double side) {
		this.side = side;
	}
	
	@Override
	public double area() {
		return side * side * Math.sqrt(3) / 4;
	}
	
	@Override
	public double perimeter() {
		return 3 * side;
	}
	
	public String toString() {
		return "도형의 종류: 사각형, " + "둘레: " + this.perimeter() + "cm, 넓이: " + this.area() + "cm^2";
	}
}
