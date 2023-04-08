package Exercise.Chapter08;

public abstract class Shape implements Comparable<Shape> {
	public abstract double area();
	public abstract double perimeter();

	@Override
	public int compareTo(Shape shape) {
		//숫자
		if(area() > shape.area()) { 
			return 1;  //자리 교환 변경o
		} else if(area() == shape.area()) { 
			return 0;
		} else { 
			return -1;  // 제자리  변경x
		}
	}
}
