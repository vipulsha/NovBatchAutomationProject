package com.pranav;
import java.util.Scanner;

/*
   1
  121
 12312
1234123
 */

public class p12 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number of rows: ");
		int n = sc.nextInt();

		for(int row=1;row<=n;row++)
		{
			for(int space=n-row;space>=1;space--)
			{
				System.out.print(" ");
			}

			for(int star=1;star<=row;star++)
			{
				System.out.print(star);
			}

			for(int str=1;str<=row-1;str++)
			{
				System.out.print(str);
			}

			System.out.println();	
		}
		sc.close();
	}	
}