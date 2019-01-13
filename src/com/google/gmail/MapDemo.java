package com.google.gmail;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Set;

public class MapDemo {

	public static void main(String[] args) {
//		HashMap<String, String> map = new HashMap<>();
		
		HashMap<String, String> map = new HashMap<>();
		// How to add elements in map
		map.put("MH", "Mumbai");
		map.put("GA", "Jaipur");
		map.put("RJ", "Jaipur");
		map.put(null, "Nagpur");
		
		// how to access elements in map
		String value = map.get("MH");
		System.out.println(value);
		
		System.out.println(map.get("GA"));
		
		// How to iterate through map
		/*Set<String> keySet = map.keySet(); // To get all keys from Map
		for(String key : keySet) {
			String v = map.get(key);
			System.out.println(v);
		}*/
		
		Iterator<String> iterator = map.keySet().iterator();
		
		while(iterator.hasNext()) {
			String key = iterator.next();
			String v = map.get(key);
			System.out.println(key+" ==> "+v);
		}

		
	}
}
