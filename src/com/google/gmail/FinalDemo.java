package com.google.gmail;

class Base {
	public final void test() {
	}
	
//	public final abstract void test2(); // Not allowed
}

class Child extends Base { // final classes cannot be extended
	/*@Override
	public void test() { // Cannot override final method from base class
	}*/
}


public class FinalDemo {

	final int b; // data member
	static final int c;

	static {
		c = 10;
	}
	
	public FinalDemo() {
		b = 10;
	}
	
	public static void main(String[] args) {
		final int a;
		a = 20;
//		a = a+10;  // Not allowed
		
		FinalDemo d = new FinalDemo();
//		d.b = 10; // Not allowed
//		d.c = 20;
		
		
	}
}
