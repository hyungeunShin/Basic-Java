package Exercise.Chapter06;

public class CarTest {
	public static void main(String[] args) {
		Car c = new Car("red");
		System.out.println("차의 색: " + c.getColor());
		System.out.println("차의 최대 속력: " + Car.getMaxSpeed() + "km/h");
		
		System.out.print("첫 번째 speedUp(100.0km/h): ");
		if(c.speedUp(100.0)) {
			System.out.print("속도 변경 가능,");			
		} else {
			System.out.print("속도 변경 불가능,");
		}
		System.out.println("현재 차의 속력: " + c.getSpeed() + "km/h");
		
		
		System.out.print("두 번째 speedUp(90.0km/h): ");
		if(c.speedUp(90.0)) {
			System.out.print("속도 변경 가능,");			
		} else {
			System.out.print("속도 변경 불가능,");
		}
		System.out.println("현재 차의 속력: " + c.getSpeed() + "km/h");
		
		
		Car c1 = new Car("blue");
		System.out.println();
		System.out.println("차의 색: " + c1.getColor());
		System.out.println("차의 최대 속력: " + Car.getMaxSpeed() + "km/h");
		
		System.out.print("첫 번째 speedUp(100.0km/h): ");
		if(c1.speedUp(100.0)) {
			System.out.print("속도 변경 가능,");			
		} else {
			System.out.print("속도 변경 불가능,");
		}
		System.out.println("현재 차의 속력: " + c1.getSpeed() + "km/h");
		
		System.out.print("두 번째 speedUp(210.0km/h): ");
		if(c1.speedUp(210.0)) {
			System.out.print("속도 변경 가능,");			
		} else {
			System.out.print("속도 변경 불가능,");
		}
		System.out.println("현재 차의 속력: " + c1.getSpeed() + "km/h");
	}
}
