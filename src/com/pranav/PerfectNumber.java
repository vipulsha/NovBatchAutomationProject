package com.pranav;
import java.util.Scanner;

public class PerfectNumber {
	public static void main(String[] args) {
		int i, n, Sum = 0 ;
		Scanner sc = new Scanner(System.in);		
		System.out.print("Enter The Number: ");
		n = sc.nextInt();

		for(i = 1 ; i < n ; i++) {
			if(n % i == 0)  {
				Sum = Sum + i;
			}
		}
		if (Sum == n) {
			System.out.format(n+" is a Perfect Number");
		}
		else {
			System.out.format(n+" is NOT a Perfect Number");
		}
		sc.close();
	}
}