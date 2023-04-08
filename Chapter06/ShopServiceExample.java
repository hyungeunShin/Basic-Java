package Chapter06;

public class ShopServiceExample {
	public static void main(String[] args) {
		ShopService s1 = ShopService.getInstance();
		ShopService s2 = ShopService.getInstance();
		
		if(s1 == s2) {
			System.out.println("같음");
		} else {
			System.out.println("다름");
		}
	}
}
