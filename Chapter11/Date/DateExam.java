package Chapter11.Date;

import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;

public class DateExam {
	public static void main(String[] args) {
		Date d = new Date();
		SimpleDateFormat s = new SimpleDateFormat("yyyy년 MM월 dd일 E요일 hh시 mm분 ss초");
		String f = s.format(d);
		System.out.println(f);
		
		String format = LocalDateTime.now().format(DateTimeFormatter.ofPattern("yyyy년 MM월 dd일 E요일 hh시 mm분 ss초"));
		System.out.println(format);		
	}
}
