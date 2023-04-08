package Chapter06;

public class CarExample {
	public static void main(String[] args) {
		/*Car c1 = new Car();
		System.out.println("제작회사 : " + c1.company);
		System.out.println("모델명 : " + c1.model);
		System.out.println();
		
		Car c2 = new Car("버스");
		System.out.println("제작회사 : " + c2.company);
		System.out.println("모델명 : " + c2.model);
		System.out.println();
		
		Car c3 = new Car("스파크", "빨강");
		System.out.println("제작회사 : " + c3.company);
		System.out.println("모델명 : " + c3.model);
		System.out.println("색상 : " + c3.color);
		System.out.println();
		
		Car c4 = new Car("택시", "검정", 200);
		System.out.println("제작회사 : " + c4.company);
		System.out.println("모델명 : " + c4.model);
		System.out.println("색상 : " + c4.color);
		System.out.println("제작회사 : " + c4.maxSpeed);
		*/
		Car c5 = new Car(50,"버스","흰색");  //생성자를 통해서 호출만 하는것
		c5.fn();
		Car c6 = new Car("택시","검정",30);
		c6.fn();
		//System.out.println(c5.model);
		//System.out.println(c5.color);
		}
		 
}
