
public class Rectangle {

	// Data members (instance variables)
	public int length;
	int width;
	
	// Parameterless constructor
	public Rectangle() {
		System.out.println("in paraless constr");
		length = 5;
		width = 10;
	}
	
	// Parameterized constructors
	public Rectangle(int l, int w) {
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
		Rectangle o = new Rectangle();
//		o.length = 10; // Initializing data member
//		o.width = 20;
		o.calculateArea();

		Rectangle o2 = new Rectangle(30, 40);
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
