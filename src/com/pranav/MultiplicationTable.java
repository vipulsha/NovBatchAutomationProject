package com.pranav;
import java.util.Scanner;

public class MultiplicationTable {
	public static void main(String args[]) {
		int n, c;
		System.out.print("Enter the number to print table: ");
		Scanner in = new Scanner(System.in);
		n = in.nextInt();
		System.out.println("Multiplication table of " + n);
		for (c = 1; c <= 10; c++)
			System.out.println(n + "*" + c + " = " + (n*c));
		in.close();
	}
}