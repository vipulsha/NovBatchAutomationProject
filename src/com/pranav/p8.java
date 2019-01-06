package com.pranav;
import java.util.Scanner;

/*
 *****
  ****
   ***
    **
     *
*/

public class p8 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number of rows: ");
		int n=sc.nextInt();
		for(int row=1;row<=n;row++) {
			for(int space=1;space<=row;space++) {
				System.out.print(" ");
			}
			for(int star=row;star<=n;star++) {
				System.out.print("*");
			}
			sc.close();
			System.out.println();
		}
	}
}