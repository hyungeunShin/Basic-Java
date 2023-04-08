package Chapter07;

public class InstanceofExample {
	public static void method1(Parent parent) {
		if(parent instanceof Child) {
			Child child = (Child) parent;
			child.field1="";
			System.out.println("Child 변환성공");
		} else {
			System.out.println("Child 실패");
		}
		
	}
	
	public static void method2(Parent parent) {		
		Child child = (Child) parent;
		child.field1="";
		System.out.println("Child 변환성공!!!!!!!!!!!!!!!!!!!");		
	}
	
	public static void main(String[] args) {
		Parent p = new Parent();
		method1(p);
		//method2(p);
		
		Parent p1 = new Child();
		method1(p1);
		method2(p1);
		
		Child c = new Child();
		method1(c);
		method2(c);
	}
}
