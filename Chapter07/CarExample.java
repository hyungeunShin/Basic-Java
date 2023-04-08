package Chapter07;

public class CarExample {
	public static void main(String[] args) {
		Car c = new Car();
		Tire h1 = new HankookTire("앞왼쪽", 15);
		Tire h2 = new HankookTire("뒤왼쪽", 14);
		Tire k1 = new KumhoTire("앞오른쪽", 13);
		Tire k2 = new KumhoTire("뒤오른쪽", 17);
		
		
		for (int i = 1; i <= 5; i++) {
			int problemlocation = c.run();
			
			switch(problemlocation) {
			case 1:
				System.out.println("앞왼쪽 HankookTire로 교체");
				//c.frontLeftTire = new HankookTire("앞왼쪽", 15);
				c.frontLeftTire = h1;
				break;
			case 2:
				System.out.println("앞오른쪽 KumhoTire로 교체");
				//c.frontRightTire = new KumhoTire("앞오른쪽", 13);
				c.frontRightTire = k1;
				break;
			case 3:
				System.out.println("뒤왼쪽 HankookTire로 교체");
				//c.backLeftTire = new HankookTire("뒤왼쪽", 14);
				c.backLeftTire = h2;
				break;
			case 4:
				System.out.println("뒤오른쪽 KumhoTire로 교체");
				//c.backRightTire = new KumhoTire("뒤오른쪽", 17);
				c.backRightTire = k2;
				break;				
			}
			System.out.println("------------------------");
		}
	}
}
