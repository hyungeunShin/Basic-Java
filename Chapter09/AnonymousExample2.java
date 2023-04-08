package Chapter09;

public class AnonymousExample2 {
	public static void main(String[] args) {
		Anonymous2 a = new Anonymous2();
		
		//익명 객체 필드
		a.a.turnOn();
		
		//익명 로컬
		a.method1();
		
		//익명 매개값
		a.method2(new RemoteControl() {
			public void turnOn() {
				System.out.println("smart tv킴");
			}
			public void turnOff() {
				System.out.println("smart tv끔");
			}
		});
	}
}
