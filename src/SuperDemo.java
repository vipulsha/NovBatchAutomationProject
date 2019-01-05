
class A {
	int a;
	public void someTest() {
		int b;
		
		
//		this.b = 10;
		
	}
} 

class B extends A {
	int a;
	
	public void method() {
		if (super.a > a) {
			System.out.println("Base.a is greater");
			super.someTest();
		} else {
			System.out.println("Base.a is smaller");
		}
	}
}

class C extends B {
	int a;
	
	public void method2() {
		
	}
}

public class SuperDemo {

}
