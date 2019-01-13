package com.google.gmail;

import java.util.TreeMap;
import java.util.TreeSet;

public class TreeMapDemo {
	
	public static void main(String[] args) {
		TreeMap<String, String> map = new TreeMap<>();
		map.put("MH", "Mumbai");
		map.put("GA", "Panjim");
		map.put(null, "Nagpur");
		
		for (String key : map.keySet()) {
			System.out.println(map.get(key));
		}
	}

}
