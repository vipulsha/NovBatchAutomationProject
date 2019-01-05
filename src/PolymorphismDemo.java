
class Maths {
	int add(int a, int b) {
		return a+b;
	}
	
	// As comparet to abobve method, 
	//1. return types are different
	//2. types of parameters are also different
	void add(double a, double b) {
		System.out.println(a+b);
	}
	
	// Types of parameters are different as compared to other methods with same name
	void add(int a, double b) {
		System.out.println(a+b);
	}
	
	// Sequence of parameters are different as compared to above method
	void add(double a, int b) {
		System.out.println(a+b);
	}
	
	// No of parameters are different as compared to above method
	void add(double a, int b, double c) {
		System.out.println(a+b+c);
	}
}

public class PolymorphismDemo {
	public static void main(String[] args) {
		Maths m = new Maths();
		m.add(10, 20);
		m.add(10,20.1);
	}
}
