package Chapter09;

public class AnonymousExample {
	public static void main(String[] args) {
		Anonymous an = new Anonymous();

		an.a.wake();

		an.method1();

		an.method2(new Person() {
			void study() {
				System.out.println("공부");
			}

			@Override
			void wake() {
				System.out.println("8시");
				study();
			}
		});
	}
}
