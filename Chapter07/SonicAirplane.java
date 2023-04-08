package Chapter07;

public class SonicAirplane extends Airplane{
	public static final int NORMAL = 1;
	public static final int SONIC = 2;
	
	public int flymode = NORMAL;

	@Override
	public void fly() {
		if(flymode == SONIC) {
			System.out.println("초음속비행");
		} else {
			super.fly();			
		}
	}	
}
