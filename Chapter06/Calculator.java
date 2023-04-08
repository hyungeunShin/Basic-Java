package Chapter06;

public class Calculator {
	
	int plus(int x, int y) {
		int result = x+y;
		return result;
	}
	
	double avg(int x, int y) {
		double sum = plus(x,y);
		double result = sum / 2;
		return result;
	}	
	
	void execute() {
		double result = avg(7,10);
		println("" + result);
	}
	
	void println(String message) {
		System.out.println(message);
	}
	
	/*double divide(int x, int y) {		
		return (double)x/y;
	}
	
	void powerOn() {
		System.out.println("전원을 켭니다");
	}
	
	void powerOff() {
		System.out.println("전원을 끕니다");
	}*/
}
