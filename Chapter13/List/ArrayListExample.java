package Chapter13.List;

import java.util.*;

public class ArrayListExample {
	public static void main(String[] args) {
		// 초급
//		ArrayList<String> b = new ArrayList<>();
		
		// 중급
		List<String> a = new ArrayList<>();		
//		a = new Vector<>();
//		a = new LinkedList<>();
		
		// 고급
//		List<String> c = Arrays.asList(null);
		
		a.add("Java");
		a.add("JDBC");
		a.add("Servlet/JSP");
		a.add(2,"Database");
		a.add("iBATIS");
		System.out.println(a.size());
		
		System.out.println(a.get(2));
		
		for (String string : a) {
			System.out.println(string);
		}
		
		a.remove(2);
		a.remove(2);
		a.remove("iBATIS");
		
		for (String string : a) {			
			System.out.println(string);
		}
		
		a.clear();
	}
}
