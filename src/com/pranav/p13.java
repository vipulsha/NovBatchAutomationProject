package com.pranav;
import java.util.Scanner;

/*
     1
    212
   32123
  4321234
 543212345
65432123456
*/

public class p13 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number of rows: ");
		int n=sc.nextInt();
		for(int row=1;row<=n;row++)
		{
			for(int space=n-row;space>0;space--)
			{
				System.out.print(" ");
			}

			for(int star=row;1<=star;star--)
			{
				System.out.print(star);
			}

			for(int str=2;str<=row;str++)
			{
				System.out.print(str);
			}

			System.out.println();
		}
		sc.close();
	}
}