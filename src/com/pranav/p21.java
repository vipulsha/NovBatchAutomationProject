package com.pranav;
import java.util.Scanner;

/*
      *****
    *****
   *****
  *****
 *****


 *****
  *****
   *****
    *****
     *****

 */

public class p21 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number: ");
		int n=sc.nextInt();
		for(int row = n; row > 0; row--) {
			for (int space = 1; space <= row; space++)
				System.out.print(" ");
			for(int star = 1; star <= n; star++)
				System.out.print("*");
			System.out.println();
		}

		System.out.println();
		System.out.println();
		for(int row = 1; row <= n; row++) {
			for (int space = 1; space <= row; space++)
				System.out.print(" ");
			for(int star = 1; star <= n; star++)
				System.out.print("*");
			System.out.println();
		}
		sc.close();
	}
}