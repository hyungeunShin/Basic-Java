package Exercise.Chapter06;

public class Time {
	private int hour;
	private int minute;
	private int second;
	
	public Time() {
	}
	
	public Time(int hour, int minute, int second) {
		if((0<=hour && hour<=23)) {
			this.hour = hour;			
		} 
		
		if(0<=minute && minute<=59) {
			this.minute = minute;
		} 
		
		if(0<=second && second<=59) {			
			this.second = second;
		} 	
	}
	
	public String toString() {
		return String.format("%02d:%02d:%02d", hour, minute, second);
	}
}
