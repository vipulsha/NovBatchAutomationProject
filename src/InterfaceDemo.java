
interface I1 {
	int a = 10;
	public void test1();
	public void test2();
	
	public static void test3() {
		
	}
	
	default void test4() {
		
	}
	
}

interface I3 {
	int a = 20;
	
	public void test1();
}

public class InterfaceDemo implements I1,I3{

	@Override
	public void test1() {
		System.out.println("In derived class");
	}

	@Override
	public void test2() {
		// TODO Auto-generated method stub
		
	}
	
	public static void main(String[] args) {
//		I1 o = new I1(); // Cannot create object of interface
		I1 o = new InterfaceDemo(); // But we can store the derived class object in o
		
		o.test1();
		
		o.test1();
		System.out.println();
		
		
//		System.out.println(o.a);
//		System.out.println(I1.a);
////		o.a = 20; Not allowed
//		System.out.println(o.a);
	}

}
