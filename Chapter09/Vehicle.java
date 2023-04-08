package Chapter09;

public interface Vehicle {
	void run();
	Vehicle v = new Vehicle() {
		public void run() {
			System.out.println("출력");
		}
	};
	Vehicle v1 = () -> System.out.println("출력");
}
