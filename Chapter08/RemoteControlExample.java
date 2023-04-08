package Chapter08;

public class RemoteControlExample {
	public static void main(String[] args) {
		RemoteControl rc;
		rc = new Television();
		rc.setVolume(5);
		rc = new Audio();
		rc.setVolume(50);
	}
}
