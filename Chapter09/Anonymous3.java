package Chapter09;

public class Anonymous3 {
	Vehicle v = () -> System.out.println("자전거");
	
	void method1() {
		Vehicle v = () -> System.out.println("승용차");
		v.run();
	}
	
	void method2(Vehicle v) {
		v.run();
	}
}
