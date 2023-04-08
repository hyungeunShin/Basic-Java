package Chapter11.Date;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class DateExample {
	public static void main(String[] args) {
		Date d = new Date();
		String s = d.toString();
		System.out.println(s);
		
		//날짜 포맷팅 SimpleDateFormat
		SimpleDateFormat sd = new SimpleDateFormat("yyyy-MM-dd E hh:mm:ss");
		String f = sd.format(d);
		System.out.println(f);
		
		Calendar c = Calendar.getInstance();
		int year = c.get(Calendar.YEAR);
		int month = c.get(Calendar.MONTH); //1월이 0, 12월이 11
		int day = c.get(Calendar.DAY_OF_MONTH);
		int date = c.get(Calendar.DAY_OF_WEEK); //요일
		int hour = c.get(Calendar.HOUR);
		int min = c.get(Calendar.MINUTE);
		int sec = c.get(Calendar.SECOND);
		System.out.printf("%d-%02d-%02d %d %02d:%02d:%02d", year, month, day, date, hour, min, sec);
	}
}
