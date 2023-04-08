package Chapter07;

public class SonicAirplaneExample {
	public static void main(String[] args) {
		SonicAirplane s = new SonicAirplane();
		s.takeoff();
		s.fly();
		s.flymode = SonicAirplane.SONIC;
		s.fly();
		s.flymode = SonicAirplane.NORMAL;
		s.fly();
		s.land();
	}
}
