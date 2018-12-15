
public class CircleArea {
	int radius;
	
	public CircleArea() {
		// TODO Auto-generated constructor stub
		System.out.println("I m in parameterless constructor");
		radius = 5;
	}
	
	public CircleArea (int r) {
		System.out.println("I m in parameterized constructor");
		radius = r;
	}
	
	public void calculateAre() {
		System.out.println("Area: "+ radius*radius*22/7);
	}
	
	public static void main(String[] args) {
		CircleArea A = new CircleArea();
		A.calculateAre();
		
		CircleArea A1 = new CircleArea(10);
		A1.calculateAre();
	}
}
