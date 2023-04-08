package Chapter09;

public class Anonymous {
	Person a = new Person() {
		void work() {
			System.out.println("출근");
		}
		@Override
		void wake() {
			System.out.println("6시에 일어난다");
			work();
		}
	};
	
	void method1() {
		Person b = new Person() {
			void walk() {
				System.out.println("산책");
			}
			@Override
			void wake() {
				System.out.println("5시에 일어난다");
				walk();
			}
		};
		b.wake();
	}
	void method2(Person person) {
		person.wake();
	}
}
