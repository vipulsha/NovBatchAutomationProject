package com.google.gmail;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Vector;

public class LinkedListDemo {

	public static void main(String[] args) {
		LinkedList<Integer> list = new LinkedList<>();
		list.add(10);
		list.add(20);
		list.addFirst(30);
		list.addLast(40);
		
		// Iterate through LinkedList
		Iterator<Integer> iterator = list.iterator();
		while(iterator.hasNext()) {
			System.out.println(iterator.next());
		}

		Vector<Integer> v = new Vector<>();
		
	}
}
