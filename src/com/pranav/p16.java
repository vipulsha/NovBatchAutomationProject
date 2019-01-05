package com.pranav;
import java.util.Scanner;

/*
4321234
 32123
  212
   1  
 */

public class p16 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("How many rows? ");
		int n = sc.nextInt();

		for (int row=n;row>=1;row--) {
			for (int space=1;space<=n-row;space++) {
				System.out.print(" ");
			}
			for (int star=row;star>=1;star--) {
				System.out.print(star);
			}
			for (int starr=2;starr<=row;starr++) {
				System.out.print(starr);
			}
			sc.close();
			System.out.println();
		}
	}
}