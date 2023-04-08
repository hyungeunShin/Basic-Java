package Chapter06;

public class SingletonExample {
	public static void main(String[] args) {
		//new Singleton();
		Singleton i1 = Singleton.getInstance();
		Singleton i2 = Singleton.getInstance();
		
		i1.setName("홍길동");		
		System.out.println(i2.getName());
	}	
}
