package Chapter09;

public class AnonymousExample3 {
	public static void main(String[] args) {
		Anonymous3 a = new Anonymous3();
		
		a.v.run();
		a.method1();
		a.method2(new Vehicle() {
			public void run() {
				System.out.println("트럭");
			}
		});		
	}
}
