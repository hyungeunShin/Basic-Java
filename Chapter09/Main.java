package Chapter09;

//바깥클래스
class A {
	A() {System.out.println("A 생성");}
	
	//인스턴스 멤버 클래스
	class B {
		B() {System.out.println("B 생성");}
		int field;
		//static int field2;
		void method1() {}
		//static void method2() {}
	}
	
	//정적 멤버 클래스
	static class C {
		C() {System.out.println("C 생성");}
		int field;
		static int field2;
		void method1() {}
		static void method2() {}
	}
	
	void method() {
		//로컬 클래스
		class D {
			D() {System.out.println("D 생성");}
			//int field;
			//static int field2;
			void method1() {}
			//static void method2() {}
 		}
		D d = new D();
		//d.field = 3;
		d.method1();
	}
}

public class Main {
	public static void main(String[] args) {
		A a = new A();
		
		//인스턴스 멤버 생성
		A.B b = a.new B();
		b.field = 1;
		b.method1();
		
		//정적 멤버 생성		
		A.C c = new A.C();
		c.field = 1;
		c.method1();
		A.C.field2 = 2;
		A.C.method2();
		
		//로컬 클래스 생성
		a.method();
	}
}
