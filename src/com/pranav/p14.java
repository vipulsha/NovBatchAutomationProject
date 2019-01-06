package com.pranav;
import java.util.Scanner;

/*
*******
 *****
  ***
   *

*/

public class p14 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number of rows: ");
		int n=sc.nextInt();
		for(int row=n;row>0;row--) {
			for(int space=1;space<=n-row;space++) {
				System.out.print(" ");
			}
			for(int star=1;star<=(2*row)-1;star++) {
				System.out.print("*");
			}
			sc.close();
			System.out.println();
		}
	}
}