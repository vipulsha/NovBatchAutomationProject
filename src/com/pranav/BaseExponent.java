package com.pranav;
import java.util.Scanner;

public class BaseExponent {
	public static int power(int b, int p) {
		int temp;
		if( p == 0) {
			return 1;
		}
		temp = power(b, p/2);

		if (p%2 == 0) {
			return (temp*temp);
		}
		else
		{
			if(p > 0) {
				return (b * temp * temp);
			}
			else {
				return (temp * temp) / b;
			}
		}
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the value of Base: ");
		int x = sc.nextInt();
		System.out.print("Enter the value of Exponent: ");
		int y = sc.nextInt();
		System.out.print("The Result is: "+power(x,y));
		sc.close();
	}
}