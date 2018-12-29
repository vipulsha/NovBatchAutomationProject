
public class StaticMethodDemo {

	static int a;
	int b;
	
	static void test() {
		System.out.println("in test()");
//		b = 20;
	}
	
	void test2() {
		test();
	}
	
	public static void main(String[] args) {
		a = 10;
	}
}
