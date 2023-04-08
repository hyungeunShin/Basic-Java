package Chapter13;

import java.util.*;
import java.util.Map.Entry;

public class MapExample {
	public static void main(String[] args) {
		Map<String,Integer> m = new HashMap<>();
		
		m.put("blue", 96);
		m.put("hong", 86);
		m.put("white", 92);
		
		String name = null;
		int max = 0;
		int totalScore = 0;
		
		Set<Entry<String, Integer>> entry = m.entrySet();
		for (Entry<String, Integer> e : entry) {
			if(e.getValue()>max) {
				name = e.getKey();
				max = e.getValue();
			}
			totalScore += e.getValue(); 
		}
		
		System.out.println(name);
		System.out.println(max);
		System.out.println(totalScore);		
	}
}
