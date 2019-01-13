package com.google.gmail;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class SetDemo {

	public static void main(String[] args) {
		
/*		HashSet<Integer> set = new HashSet<>();
		
		set.add(10);
		set.add(20);
		set.add(30);
		set.add(40);
		set.add(50);
		set.add(10);
		set.add(null);
		set.add(null);
		
		Iterator<Integer> iterator = set.iterator();
		while(iterator.hasNext()) {
			System.out.println(iterator.next());
		}*/
		
/*		LinkedHashSet<Integer> set = new LinkedHashSet<>();
		set.add(10);
		set.add(10);
		set.add(50);
		set.add(20);
		set.add(30);
		set.add(40);
		
		for (Integer integer : set) {
			System.out.println(integer);
		}*/
		
		TreeSet<Integer> set = new TreeSet<>();
		set.add(30);
		set.add(10);
		set.add(20);
		set.add(10);
		set.add(50);
		set.add(40);
		set.add(null);
		
		for (Integer integer : set) {
			System.out.println(integer);
		}
		
		
	}
}
