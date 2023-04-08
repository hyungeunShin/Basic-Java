package Chapter09;

public class Anonymous2 {
	RemoteControl a = new RemoteControl() {
		public void turnOn() {
			System.out.println("tv 킴");
		}
		
		public void turnOff() {
			System.out.println("tv 끔");
		}
	};
	
	void method1() {
		RemoteControl b = new RemoteControl() {
			public void turnOn() {
				System.out.println("audio 킴");
			}
			
			public void turnOff() {
				System.out.println("audio 끔");
			}
		};
		b.turnOn();
	}
	void method2(RemoteControl r) {
		r.turnOn();
	}
}
