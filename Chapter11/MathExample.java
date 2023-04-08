package Chapter11;

public class MathExample {
	public static void main(String[] args) {
		int a1 = Math.abs(-5);
		double a2 = Math.abs(-3.14);
		System.out.println(a1);
		System.out.println(a2);
		
		double a3 = Math.ceil(5.3);
		double a4 = Math.ceil(-5.3);
		System.out.println(a3);
		System.out.println(a4);
		
		double a5 = Math.floor(5.3);
		double a6 = Math.floor(-5.3);
		System.out.println(a5);
		System.out.println(a6);
		
		int a7 = Math.max(5, 9);
		double a8 = Math.max(5.3, 2.5);
		System.out.println(a7);
		System.out.println(a8);
		
		int a9 = Math.min(5, 9);
		double a10 = Math.min(5.3, 2.5);
		System.out.println(a9);
		System.out.println(a10);
		
		double a11 = Math.random();
		System.out.println(a11);
		
		double a12 = Math.rint(5.3);
		double a13 = Math.rint(5.7);
		System.out.println(a12);
		System.out.println(a13);
		
		long a14 = Math.round(5.3);
		long a15 = Math.round(5.7);
		System.out.println(a14);
		System.out.println(a15);
		
		double value = 12.3456;
		double temp = value * 100;
		long num = Math.round(temp);
		double a16 = num / 100.0;
		System.out.println(num);
		System.out.println(a16);
	}
}

