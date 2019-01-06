package com.pranav;
import java.util.Scanner;

/*
**********
 *******
  *****
   ***
    *
    *
   ***
  *****
 *******
**********

 */

public class p17 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number: ");
		int n=sc.nextInt();
		for(int row=n; row>0; row--) {
			for(int space=1; space<=n-row; space++)
				System.out.print(" ");
			for(int star=1; star<=(row*2)-1; star++) {
				System.out.print("*");
			}
			System.out.println();
		}
		for(int row=1; row<=n; row++) {
			for(int space=1; space<=n-row; space++)
				System.out.print(" ");			
			for(int star=1; star<=(row*2)-1; star++)
				System.out.print("*");
			System.out.println();
		}
		sc.close();
	}
}