package Chapter08;

public class SoundableExample {
	public static void main(String[] args) {
		printsound(new Cat());
		printsound(new Dog());
		
	}
	
	private static void printsound(Soundable s) {
		System.out.println(s.sound());
	}
}
