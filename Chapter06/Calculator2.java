package Chapter06;

public class Calculator2 {//static과 dynamic의 영역이 다르다고 생각   dynamic은 static을 볼수있고 static은 dynamic을 못봄
	int value;
	
	static double pi = 3.14159;
	
	static int plus(int x, int y) {
		Calculator2.pi = 2.4;
		return x+y;
	}
	
	void run() {
		pi = 2.2;
		System.out.println("계산기");
	}
		
	public static void main(String[] args) {
		//value = 10;  static안에서 동적변수는 에러
		Calculator2 c = new Calculator2(); //static안에서 필드를 사용하고싶으면  생성자사용
		c.value = 10;
		
		//static메서드 호출
		int plus = Calculator2.plus(0, 0);
		System.out.println(plus);
		
	}
}
