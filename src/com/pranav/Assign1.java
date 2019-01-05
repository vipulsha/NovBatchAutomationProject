package com.pranav;
import java.util.Scanner;

public class Assign1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the Value of a: ");
		int a = sc.nextInt();
		System.out.print("Enter the Value of b: ");
		int b = sc.nextInt();
		System.out.println();
		System.out.println("Enter Your Choice: "+"1. Addition	"+"2. Subtraction	"+"3. Division	"+"4. Multiplication	");
		int c = sc.nextInt();

		if(c==1) {
			System.out.println("Addition of two Numbers is: " + (a+b));
		} else if(c==2){
			System.out.println("Substraction of two Numbers is: "+ (a-b));
		} else if (c==3) {
			System.out.println("Division of two Numbers is: " + (a/b));
		} else if (c == 4) {
			System.out.println("Division of two numbers is: "+ (a*b));
		}
		else {
			System.out.println("Invalid Option Selected");
		}
		sc.close();
	}
}