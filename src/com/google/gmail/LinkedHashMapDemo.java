package com.google.gmail;

import java.util.LinkedHashMap;

public class LinkedHashMapDemo {

	public static void main(String[] args) {
		LinkedHashMap<String, String> map = new LinkedHashMap<>();
		map.put("MH", "Mumbai");
		map.put("GA", "Panjim");
		map.put("RJ", "Jaipur");
		
		for (String key : map.keySet()) {
			System.out.println(map.get(key));
		}
		
	}
}
