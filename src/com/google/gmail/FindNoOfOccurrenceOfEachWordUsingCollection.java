package com.google.gmail;

import java.util.ArrayList;
import java.util.HashMap;

public class FindNoOfOccurrenceOfEachWordUsingCollection {

	public static void main(String[] args) {
		
		String s = "This is a table this table is wooden";
		String[] words = s.split(" ");

		HashMap<String, Integer> map = new HashMap<String, Integer>();
		
		for(int i=0; i<words.length; i++) {
			String word = words[i].toUpperCase();
			if (map.containsKey(word)) {
				int oldCnt = map.get(word);
				map.put(word, oldCnt+1);
			} else {
				map.put(word.toUpperCase(), 1);	
			}
		}
		
		for (String key : map.keySet()) {
			System.out.println(key+" ==> "+map.get(key));
		}
		
		
		
		
		
		
		
		
		/*		ArrayList<String> list = new ArrayList<>();
		
		for(int i=0; i<words.length; i++) {
			String firstWord = words[i];
			int cnt = 1;
			
			if(! list.contains(firstWord.toUpperCase())) {
				for(int j=i+1; j<words.length; j++) {
					String secondWord = words[j];
					if (firstWord.equalsIgnoreCase(secondWord)) {
						cnt++;
					}
				}
				
				list.add(firstWord.toUpperCase());
				System.out.println(firstWord +" ==> "+cnt);
			}
		}*/
		
		
		
		
	}
}
