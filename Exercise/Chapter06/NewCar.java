package Exercise.Chapter06;

public class NewCar {
	private double speed;
	private String color;
	private static final double MAX_SPEED = killoToMile(200);

	public NewCar() {

	}

	public NewCar(String color) {
		this.color = color;
	}

	public double getSpeed() {
		return mileToKillo(speed);
	}

	public void setSpeed(double speed) {
		this.speed = killoToMile(speed);
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}
	
	public boolean speedUp(double speed) {
		if (this.speed + killoToMile(speed) > 0 && this.speed + killoToMile(speed) < killoToMile(MAX_SPEED)) {
			this.speed += killoToMile(speed);
			return true;
		}
		return false;
	}

	public static double getMaxSpeed() {
		return mileToKillo(MAX_SPEED);
	}

	private static double killoToMile(double distance) {
		return distance / 1.6;
	}

	private static double mileToKillo(double distance) {
		return 1.6 * distance;
	}

	@Override
	public String toString() {
		return "NewCar [speed=" + speed + ", color=" + color + "]";
	}
}
