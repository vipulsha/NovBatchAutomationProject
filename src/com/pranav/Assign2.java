package com.pranav;
import java.util.Scanner;

public class Assign2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the value of a: ");
		int a = sc.nextInt();
		System.out.print("Enter the value of b: ");
		int b = sc.nextInt();
		System.out.println("Enter Your Choice: "+"1. Addition	"+"2. Subtraction	"+"3. Division	"+"4. Multiplication	");
		int c = sc.nextInt();

		switch (c) {
		case 1:
			System.out.println("Addition of two numbers is: "+(a+b));
			break;
		case 2:
			System.out.println("Subtraction of two numbers is: "+(a-b));
			break;
		case 3:
			System.out.println("Division of two numbers is: "+ (a/b));
			break;
		case 4:
			System.out.println("Multiplication of two numbers is: "+(a*b));
			break;
		case 5:
			System.out.println("Invalid option selected!!");
		}
		sc.close();
	}
}