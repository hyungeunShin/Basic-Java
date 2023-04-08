package Exercise.Chapter06;

public class PlaneTest {
	public static void main(String[] args) {
		Plane p = new Plane("보잉", "보잉 747", 450);
		System.out.println("제조사: " + p.getManufacturer());
		System.out.println("모델명: " + p.getModel());
		System.out.println("최대승객수: " + p.getMaxNumberOfPassengers());
		System.out.println();
		
		Plane p2 = new Plane("보잉", "보잉 777", 500);
		System.out.println("제조사: " + p2.getManufacturer());
		System.out.println("모델명: " + p2.getModel());
		System.out.println("최대승객수: " + p2.getMaxNumberOfPassengers());
		System.out.println();
		System.out.println(p2);
		
		Plane p3 = new Plane();
		p3.setManufacturer("록히드 마틴");
		p3.setModel("F-22");
		p3.setMaxNumberOfPassengers(-10);
		System.out.println("제조사: " + p3.getManufacturer());
		System.out.println("모델명: " + p3.getModel());
		System.out.println("최대승객수: " + p3.getMaxNumberOfPassengers());
		System.out.println();
		
		System.out.println("생산된 비행기의 수: " + Plane.getNumberOfPlanes());
	}
}
