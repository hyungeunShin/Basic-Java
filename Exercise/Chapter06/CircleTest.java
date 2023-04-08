package Exercise.Chapter06;

public class CircleTest {
	public static void main(String[] args) {
		Circle c = new Circle();
		c.setRadius(3.6);
		c.setX(0.0);
		c.setY(1.5);
		
		System.out.println("반지름: " + c.getRadius());
		System.out.println("중심 좌표: " + "(" + c.getX() + "," + c.getY() + ")");
		System.out.printf("넓이: %.2f\n", c.getArea());
		
		Circle c2 = new Circle();
		c2.setRadius(-5.0);
		c2.setX(1.0);
		c2.setY(2.2);
		
		System.out.println("반지름: " + c2.getRadius());
		System.out.println("중심 좌표: " + "(" + c2.getX() + "," + c2.getY() + ")");
		System.out.printf("넓이: %.2f\n", c2.getArea());
	}
}
