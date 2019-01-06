package com.google.gmail;

public class ThrowAndThrowsDemo {
	public static void test(int t) throws Exception {
		if (t != 20) {
			throw new Exception("Incorrect input");
		}
	}

	public static void main(String[] args) throws Exception {
		System.out.println("Enter some value: ");
		int a = 10;
		test(a);
		
		System.out.println("after test");
	}
}
