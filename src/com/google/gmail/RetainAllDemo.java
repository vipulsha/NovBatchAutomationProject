package com.google.gmail;

import java.util.ArrayList;

public class RetainAllDemo {

	public static void main(String[] args) {
		ArrayList<Integer> list1 = new ArrayList<Integer>();
		list1.add(10);
		list1.add(20);
		list1.add(30);
		
		ArrayList<Integer> list2 = new ArrayList<Integer>();
		list2.add(10);
		list2.add(20);
		list2.add(30);
		list2.add(40);
		list2.add(50);
		
		list2.retainAll(list1);
		
		for (Integer a : list2) {
			System.out.println(a);
		}
	}
}
