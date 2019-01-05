import java.util.Scanner;

public class MainClass3 {
	public static void main(String[] args) {
		
		Shape s = new Tringle(10,20);
		s.test();
		s.normlaMethod();
		
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter lenght: ");
		int l = scanner.nextInt();
		System.out.println("Enter width: ");
		int w = scanner.nextInt();
		
		System.out.println("1. Tringle");
		System.out.println("2. Rectangle");
		System.out.println("Select area to be calculated: ");
		int choice = scanner.nextInt();
		scanner.close();
		
		/*if (choice == 1) {
			Tringle t = new Tringle(l, w);
			t.calculateArea();
		} else if (choice == 2){
			Rectangle r = new Rectangle(l, w);
			r.calculateArea();
		} else {
			System.out.println("Invalid shape selected");
		}*/
		
		Shape shape = null;
		if (choice == 1) {
			shape = new Tringle(l, w);
		} else if (choice == 2){
			shape = new Rectangle(l, w);
		}
		shape.calculateArea();
	}
}
