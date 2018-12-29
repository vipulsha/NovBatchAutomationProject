import java.util.Scanner;

public class MathsOperation {
	
	// Function declaration
	int add(int a, int b) {
		return (a+b);
	}
	
	int sub(int a, int b) {
		return a-b; // returning a value from function
	}
	
	int mult(int a,int b) {
		return a*b;
	}
	
	int div(int a,int b) {
		return a/b;
	}
	
	public int GetPower(int base,int power) {
		int result = 1; 
		
		for (int i=1; i<=power;i++) {
			result = result *base;
		}
		return result;

	}
	public static void main(String[] args) {
		int Num1,Num2,result = 0;
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter number 1: ");
		Num1= scan.nextInt();
		
		System.out.println("Enter Number 2: ");
		Num2 = scan.nextInt();
		
		System.out.println("Enter Your choice: ");
		System.out.println("1. Addition\n2. Subtraction\n3. Multiplication\n4. division\n");
		
		int choice = scan.nextInt();
		
		MathsOperation ops = new MathsOperation();
		
		if (choice==1) {
			result = ops.add(Num1, Num2);
			
		}
		else if (choice ==2) {
			result = ops.sub(Num1, Num2);
		}
		else if(choice == 3) {
			result = ops.mult(Num1, Num2);
		}
		else if (choice == 4) {
			result = ops.div(Num1, Num2);
		}
		else {
			System.out.println("Incorrect choice");
		}
		
		System.out.println("result is : "+result);
		scan.close();
	}
}
