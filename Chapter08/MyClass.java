package Chapter08;

public class MyClass {
	RemoteControl r = new Television();
	
	public MyClass() {
	}
	
	MyClass(RemoteControl r) {
		this.r = r;
		r.turnOn();
		r.setVolume(5);
	}
	
	void fn1() {
		RemoteControl r = new Audio();
		r.turnOn();
		r.setVolume(5);
	}
	
	void fn2(RemoteControl r) {
		r.turnOn();
		r.setVolume(5);
	}
}
