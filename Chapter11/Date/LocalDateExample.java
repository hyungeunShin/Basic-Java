package Chapter11.Date;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class LocalDateExample {
	public static void main(String[] args) {
		//LocalDate -> 날짜만 사용 가능
		//LocalDateTime -> 날짜와 시간 사용 가능
		LocalDateTime n = LocalDateTime.now();
		System.out.println(n);
		
		// method chaining 방식
		String f = LocalDateTime.now().format(DateTimeFormatter.ofPattern("yyyy-MM-dd E hh:mm:ss"));
		System.out.println(f);
	}
}
