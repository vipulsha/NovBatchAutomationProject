package com.pranav;
import java.util.Scanner;

/*
 12345
  2345
   345
    45
     5
 */

public class p9 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number of rows: ");
		int n=sc.nextInt();
		for(int row=1;row<=n;row++) {
			for(int space=2;space<=row;space++) {
				System.out.print(" ");
			}
			for(int star=row;star<=n;star++) {
				System.out.print(star);
			}
			sc.close();
			System.out.println();
		}
	}
}