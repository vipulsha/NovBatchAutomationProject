import java.util.Scanner;
public class SwitchCaseExample {
	
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
			
			SwitchCaseExample ops = new SwitchCaseExample();
			
			switch(choice) {
			case 1:
				result = ops.add(Num1, Num2);
				break;
			case 2:
				result = ops.sub(Num1, Num2);
				break;
			case 3:
				result = ops.mult(Num1, Num2);
				break;
			case 4: 
				result = ops.div(Num1, Num2);
				break;
			default:
				System.out.println("Incorrect choice");
			
			}
			System.out.println("result is : "+result);
			scan.close();
		}
	
}