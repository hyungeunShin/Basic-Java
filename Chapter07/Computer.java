package Chapter07;

public class Computer extends Calculator{
	double area(double r) {
		System.out.println("컴퓨터 호출");
		//super.area(0);
		return Math.PI * r * r;
	}
}
