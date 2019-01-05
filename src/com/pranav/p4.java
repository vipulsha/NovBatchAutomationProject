package com.pranav;
import java.util.Scanner;

/*
12345
1234
123
12
1
 */

public class p4 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number of rows: ");
		int n = sc.nextInt();
		for(int row=n;row>0;row--) {
			for(int star=1;star<=row;star++) {
				System.out.print(star);
			}
			sc.close();
			System.out.println();
		}
	}
}