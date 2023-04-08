package Chapter13.List;

import java.util.*;

public class LinkedListExample {
	public static void main(String[] args) {
		List<String> a = new ArrayList<>();
		List<String> b = new LinkedList<>();
		
		long start;
		long end;
		
		start = System.nanoTime();
		for (int i = 0; i < 10000; i++) {
			a.add(0, String.valueOf(i));
		}
		end = System.nanoTime();
		System.out.println("ArrayList: " + (end-start));
		
		start = System.nanoTime();
		for (int i = 0; i < 10000; i++) {
			b.add(0, String.valueOf(i));
		}
		end = System.nanoTime();
		System.out.println("LinkedList: " + (end-start));
	}
}
