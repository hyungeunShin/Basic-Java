package Chapter08;

public class TireExample {
	public static void main(String[] args) {
		Tire t = new Tire() {
			public void roll() {
				System.out.println("굴러갑니다");
			}
		};
		t.roll();
	}
}
