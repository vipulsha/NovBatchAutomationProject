package com.pranav;
import java.util.Scanner;

public class EvenOdd {
	public static void main(String[] args) {
		// int a;
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter The Number:	");
		int a = scan.nextInt();		

		if (a % 2 == 0)
			System.out.println("The Number Is Even.");
		else
			System.out.println("The Number Is odd.");
		scan.close();
	}
}