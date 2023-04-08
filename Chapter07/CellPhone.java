package Chapter07;

public class CellPhone {
	//필드
	String model;
	String color;
	
	//생성자 생략
	public CellPhone() {
		
	}
	
	//메소드
	void poweron() {
		System.out.println("전원을 킵니다");
	}
	void poweroff() {
		System.out.println("전월을 끕니다");
	}
	void bell() {
		System.out.println("벨이 울립니다");
	}
	void sendvoice(String message) {
		System.out.println("자기 : " + message);
	}
	void receivevoice(String message) {
		System.out.println("상대방 : " + message);
	}
	void hangup() {
		System.out.println("전화를 끊습니다");
	}
}
