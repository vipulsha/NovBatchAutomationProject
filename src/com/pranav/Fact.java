package com.pranav;
import java.util.Scanner;

public class Fact {

	public static void main(String[] args) {
		System.out.print("Enter the number to find factorial: ");
		Scanner sc = new Scanner(System.in);
		int fact = 1;
		int no=sc.nextInt();
		int n = 1;

		while(n <= no) {
			fact = fact * n;
			n++;
		}
		System.out.println("Factorial of "+no+" is: "+fact);
		sc.close();
	}
}