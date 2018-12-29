import java.util.Scanner;

public class MathOperations {
	public static int add(int a, int b) {
		return a+b;
	}
	
	public int sub(int a, int b) {
		return a-b;
	}

	public int getPower(int base, int power) {
		int result = 1;
		// 2 ^ 3 ==> 2 * 2 * 2 = 8
		for(int i=1; i<=power;i++) {
			result = result * base;
		}
		return result;
	}
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter No1: ");
		int no1 = scanner.nextInt();
		
		System.out.println("Enter No2: ");
		int no2 = scanner.nextInt();
		
		System.out.println("1. Addition\n2. Substraction\nEnter choice: ");
		int choice = scanner.nextInt();
		scanner.close();
		
		MathOperations operations = new MathOperations();
		int result = 0;
		/*if (choice == 1) {
			result = operations.add(no1, no2);
		} else if(choice == 2) {
			result = operations.sub(no1, no2);
		} else {
			System.out.println("Incorrect option selected");
			System.exit(0);
		}
		System.out.println(result);*/
		
		switch (choice) {
		default:
			System.out.println("Invalid option selected");
		case 1:
			result = add(no1, no2);
			break;
		case 2:
			result = operations.sub(no1, no2);
			break;
		}
		System.out.println("Result: "+result);
	}
}
