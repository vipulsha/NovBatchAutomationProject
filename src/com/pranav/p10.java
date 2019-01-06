package com.pranav;
import java.util.Scanner;

/*
54321
5432
543
54
5
 */

public class p10 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number of rows: ");
		int n=sc.nextInt();
		for(int row=1;row<=n;row++) {
			for(int star=n;star>=row;star--) {
				System.out.print(star);
			}
			sc.close();
			System.out.println();
		}
	}

}