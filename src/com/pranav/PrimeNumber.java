package com.pranav;
import java.util.Scanner;

public class PrimeNumber {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number to check: ");
		int n = sc.nextInt();
		int a=0;
		for (int i=2; i<=n/2; i++) {
			a = n%i;
		}
		if(a!=0) {
			System.out.print(n+" is a Prime Number");
		} else {
			System.out.print(n+" is Not a Prime Number");
		}
		sc.close();
	}
}