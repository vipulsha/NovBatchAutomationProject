package com.google.gmail;

import java.util.ArrayList;
import java.util.Iterator;

public class ListDemo {

	public static void main(String[] args) {
		// How to create ArrayList
		ArrayList list1 = new ArrayList<>(); // Generic ArrayList
		
		// How to add elements in ArrayList
		list1.add(10);
		list1.add("Vipul");
		list1.add(true);
		list1.add(null);
		list1.add(null);
		
		
//		list1.re
		
//		Iterator iterator2 = list1.iterator();
		
		ArrayList<Integer> list2 = new ArrayList<Integer>();
		list2.add(10);
//		list2.add(""); // Not allowed
		list2.add(20);
		list2.add(30);
		
		// How to access elements in ArrayList
		System.out.println(list2.get(0));
		Integer a = list2.get(1);
		System.out.println(a);
//		System.out.println(list2.get(3)); // IndexOutOfBoundsException
		
		// How to iterate through ArrayList
		/*for(int i=0; i<list2.size(); i++) {
			System.out.println(list2.get(i));
		}*/
		
		/*for (Integer i : list2) {
			System.out.println(i);
		}*/
		
		// How to use Iterators?
		Iterator<Integer> iterator = list2.iterator();
		while(iterator.hasNext()) {
			Integer b = iterator.next();
			System.out.println(b);
		}
		
		
	}
}

