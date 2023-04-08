package Exercise.Chapter07;

public class ShapeTest {
	public static void main(String[] args) {
		Shape[] s = new Shape[3];
		
		s[0] = new Circle(1.0);
		s[1] = new Triangle(2.0);
		s[2] = new Rectangle(2.0, 3.0);
		
		for (Shape shape : s) {
			System.out.println(shape);
		}
	}
}
