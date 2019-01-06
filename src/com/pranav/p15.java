package com.pranav;
import java.util.Scanner;

/*123454321
 1234321
  12321
   121
    1
*/

public class p15 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("How many rows do you want?");
		int n=sc.nextInt();
		for(int row=n;row>=1;row--) {
			for(int space=1;space<=n-row;space++) {
				System.out.print(" ");
			}
			for(int star=1;star<=row;star++) {
				System.out.print(star);
			}
			for (int star2=row-1;star2>=1;star2--) {
				System.out.print(star2);
			}
			sc.close();
			System.out.println();
		}
	}
}