
public class Rectangle1 {

	// Data members (instance variables)
	public int length;
	int width;
	
	// Parameterless constructor
	public Rectangle1() {
		System.out.println("in paraless constr");
		length = 5;
		width = 10;
	}
	
	// Parameterized constructors
	public Rectangle1(int l, int w) {
		System.out.println("in parameterized constr");
		length = l;
		width = w;
	}
	
	// Member functions
	void calculateArea() {
		System.out.println("area: "+ length * width);
	}
	
	public static void main(String[] args) {
		// Create Object
		Rectangle1 o = new Rectangle1();
//		o.length = 10; // Initializing data member
//		o.width = 20;
		o.calculateArea();

		Rectangle1 o2 = new Rectangle1(30, 40);
		o2.calculateArea();
		o2.length = 60;
		o2.width = 70;
		o2.calculateArea();
		
		/*if(true) {
			int a = 10;
			System.out.println(a);
		}
	
		for(int i=0; i<5; i++) {
			
		}
		i = 1;*/
		
		
	}
}
