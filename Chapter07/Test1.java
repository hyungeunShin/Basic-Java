package Chapter07;

class vehicle {
	public String name = "차";
	
	vehicle() {
		System.out.println("차량");
	}
	
	void run() {
		System.out.println("달립");
	}
	
	void run1() {
		System.out.println("니다...............................");
	}
}

class bus extends vehicle {
	public String name = "버스";
	
	bus() {
		System.out.println("마을버스");
	}
	
	void run() {
		System.out.println("니다");
	}
	
	void run2() {
		System.out.println("니다...............................");
	}
	
}

public class Test1 {
	public static void main(String[] args) {
		String name = "운전자";
		
		vehicle v = new vehicle();
		System.out.println();
		vehicle v1 = new bus();
		System.out.println();
		bus b = new bus();
		System.out.println();
		
		System.out.println(name);
		System.out.println(v.name);
		System.out.println(v1.name);
		System.out.println(b.name);
		System.out.println();
		
		v.run();
		v1.run();
		v1.run1();
		//v1.run2();
		b.run1();
	}
}
