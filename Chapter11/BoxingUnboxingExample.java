package Chapter11;

public class BoxingUnboxingExample {
	public static void main(String[] args) {
		int a = 10;
		Integer b = new Integer(10);
		int bb = b.intValue();        //언박싱
		Integer d = Integer.valueOf("10");				
		Boolean c = new Boolean(false);
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		System.out.println(d);
		System.out.println(bb);
		int sum = Integer.sum(a, b);
		System.out.println(sum);
		
		//자동 박싱, 자동 언박싱
		Integer e = 10;         //자동 박싱
		int q = new Integer(10);// 자동 언박싱
		System.out.println(e);
		System.out.println(q);
	}
}
