package Chapter09;

public class Outter {
	String field = "outer";
	void method() {
		System.out.println("outer-method");
	}
	
	class Inner {
		String field = "inner";
		void method() {
			System.out.println("inner-method");
		}
		void print() {
			System.out.println(this.field);
			this.method();
			System.out.println(Outter.this.field);
			Outter.this.method();
		}
	}
}
