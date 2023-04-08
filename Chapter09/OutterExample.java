package Chapter09;

public class OutterExample {
	public static void main(String[] args) {
		Outter o = new Outter();
		Outter.Inner i = o.new Inner();
		i.print();
	}
}
