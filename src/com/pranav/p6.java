package com.pranav;
import java.util.Scanner;

/*
    1
   12
  123
 1234
12345
*/

public class p6 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number of rows: ");
		int n=sc.nextInt();
		for(int row=1;row<=n;row++) {
			for(int space=1;space<=n-row;space++) {
				System.out.print(" ");
			}
			for(int star=1;star<=row;star++) {
				System.out.print(star);
			}
			sc.close();
			System.out.println();
		}
	}
}