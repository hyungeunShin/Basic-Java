package Chapter07;

public class ChildExample {
	public static void main(String[] args) {
		Parent p = new Child();
		p.field1 = "";
		p.method1();
		p.method2();
		//p.method3();
		
		Child c = (Child) p;
		c.field2 = "a";
		c.field1 = "1";
		c.method3();
	}
}
