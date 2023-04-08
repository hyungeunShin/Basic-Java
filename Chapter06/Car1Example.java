package Chapter06;

public class Car1Example {
	public static void main(String[] args) {
		Car1 c = new Car1();
		
		c.setGas(10);
		
		boolean state = c.isLeftGas();
		if(state) {
			System.out.println("출발합니다");
			c.run();
		}
		
		if(c.isLeftGas()) {
			System.out.println("gas를 주입할 필요가 없습니다");
		} else {
			System.out.println("gas를 주입하세요");
		}
	}
}
