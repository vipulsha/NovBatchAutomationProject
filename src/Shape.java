
public abstract class Shape {
	int length;
	int width;
	int area;
	
	public Shape(int l, int w) {
		this.length = l;
		this.width = w;
	}

	public abstract void calculateArea();
	
	public abstract void displayArea();
	
	public static void test() {
		System.out.println("in base.test()");
	}
	
	public void normlaMethod() {
		System.out.println("in normal()");
	}
	
}

class Tringle extends Shape {
	public Tringle(int l, int w) {
		super(l, w);
	}

	// Overriden method
	public void calculateArea() {
		this.area = (1 / 2) * length * width;
	}

	@Override
	public void displayArea() {
		System.out.println("Area of Tringle: "+this.area);
	}
	
	public static void test() {
		System.out.println("in childs.test()");
	}
}

class Rectangle extends Shape {
	public Rectangle(int l, int w) {
		super(l, w);
	}

	@Override
	public void calculateArea() {
		this.area = length * width;
	}
	
	@Override
	public void displayArea() {
		System.out.println("Area of Rectangle: "+this.area);
	}
}