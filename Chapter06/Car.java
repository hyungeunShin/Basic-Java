package Chapter06;

public class Car {
	
	String company = "현대자동차";
	String model = "그랜저";
	String color;
	int maxSpeed;
	int speed;
	
	Car(){
		this(null,null,0);
	}
	
	Car(String model) {
		this(model,null,0);
	}
	
	Car(String model, String color) {
		this(model,color,0);
	}
		
	Car(int maxSpeed, String model, String color) {		
		//this("가", "나", 50);
		this(model,color,maxSpeed);
	}
	
	Car(String model, String color, int maxSpeed) {
		this.model = model;
		this.color = color;
		this.maxSpeed = maxSpeed;
		
		//System.out.println("차가 만들어졌습니다.");
		//System.out.println(model + " " + maxSpeed);
	}
	
	void fn() {
		System.out.println(company + model + color + maxSpeed);
	}
	
	
}
