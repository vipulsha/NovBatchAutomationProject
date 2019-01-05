package com.pranav;
import java.util.Scanner;

/*

*
**
***
****
*****

*/

public class p1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of rows: ");
		int n = sc.nextInt();
		for(int row=1;row<=n;row++) {
			for(int star=1;star<=row;star++) {
				System.out.print("*");
			}
			sc.close();
			System.out.println();
		}
	}
}