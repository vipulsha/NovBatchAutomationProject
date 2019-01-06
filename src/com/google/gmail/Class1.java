package com.google.gmail;

public class Class1 {
	
	int a; // default access specifiers
	public int b; // 
	protected int c;
	private int d;
	
	public static void main(String[] args) {
		Class1 c = new Class1();
		
	}
}

class T {
	public static void main(String[] args) {
		Class1 c = new Class1();
//		c.d = 10; // Not accessible
	}
}