package com.pranav;
import java.util.Scanner;

public class basePower {
	public static void main(String[] args) {
		System.out.print("Enter the Base ");
		Scanner b = new Scanner(System.in);
		System.out.println("and Power: ");
		Scanner p = new Scanner(System.in);

		int base = b.nextInt(), power = p.nextInt();
		long result = 1;
		
		while (power != 0) {
			result *= base;
			--power;
		}
		System.out.println("Answer = " + result);
		b.close();
		p.close();
	}
}