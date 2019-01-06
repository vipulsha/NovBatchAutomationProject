package com.pranav;
class Maths {

	int add(int a,int b) {
		return a+b;
	}

	void add(double a,double b) { //different parameters

	}
	void add(int a,double b) { // sequence of parameters

	}
	void add(double a,int b,double c) { //number of parameters

	}
}

public class PolymorphismDemo {
	public static void main(String[] args) {
		Maths m = new Maths();
		m.add(10, 20);
		m.add(10.2, 20.1);
	}
}