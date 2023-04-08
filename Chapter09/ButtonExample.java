package Chapter09;

public class ButtonExample {
	public static void main(String[] args) {
		Button b = new Button();
		
		b.set(new CallListener());
		b.touch();
		
		b.set(new MessageListener());
		b.touch();
	}
}
