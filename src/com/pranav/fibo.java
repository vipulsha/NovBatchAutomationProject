package com.pranav;
import java.util.Scanner;

public class fibo {
	public static void main(String[] args) {
		System.out.print("Enter the range: ");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int n1 = 0, n2 = 1;
		System.out.print("First "+ n +" terms: ");

		for (int i = 1; i <= n; ++i) {
			System.out.print(n1 + "  ");
			int sum = n1 + n2;
			n1 = n2;
			n2 = sum;
		}
		sc.close();
	}
}