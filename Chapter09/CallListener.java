package Chapter09;

public class CallListener implements Button.OnClickListener {
	@Override
	public void onclick() {
		System.out.println("전화");
	}
}
