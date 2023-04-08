package Chapter07;

public class ComputerExample {
	public static void main(String[] args) {
		Calculator c = new Calculator();
		double area = c.area(10);
		System.out.println(area);
		
		Computer c1 = new Computer();
		double area1 = c1.area(10);
		System.out.println(area1);
	}
}
