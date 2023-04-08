package Chapter08;

public class MyClassExample {
	public static void main(String[] args) {
		System.out.println("1)-------------------");
	    MyClass m = new MyClass();
	    m.r.turnOn();
	    m.r.setVolume(5);
	    
	    System.out.println("2)-------------------");
	    //MyClass m2 = new MyClass(new Audio());
	    
	    System.out.println("3)-------------------");
	    MyClass m3 = new MyClass();
	    m3.fn1();
	    
	    System.out.println("4)-------------------");
	    MyClass m4 = new MyClass();
	    m4.fn2(new Television());
	    
	}
}
