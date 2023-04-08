package Chapter09;

public class Button {
	OnClickListener l;
	
	void set(OnClickListener l) {
		this.l = l;
	}
	
	void touch() {
		l.onclick();
	}
	
	static interface OnClickListener {
		void onclick();
	}
}
