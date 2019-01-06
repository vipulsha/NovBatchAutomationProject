package com.pranav;
import java.util.Scanner;

public class p19 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number: ");
		int n = sc.nextInt();

		for (int row=1;row<=n;row++) {
			for (int space=1;space<=n-row;space++) {
				System.out.print(" ");
			}
			for (int star=1;star<=row;star++) {
				System.out.print(star);
			}
			for (int str=row-1;str>=1;str--) {
				System.out.print(str);
			}
			System.out.println();
		}

		for (int row=n-1;row>=1;row--) {
			for (int space=1;space<=n-row;space++) {
				System.out.print(" ");
			}
			for (int star=1;star<=row;star++) {
				System.out.print(star);
			}
			for (int str=row-1;str>=1;str--) {
				System.out.print(str);
			}
			System.out.println();
		}
		sc.close();
	}
}