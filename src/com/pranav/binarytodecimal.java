package com.pranav;
public class binarytodecimal {
	public static int covertToDecimal(int num) {
		int dnum = 0, i = 1, rem;

		while(num != 0) {
			rem = num % 10;
			dnum = dnum + rem * i;
			i = i * 2;
			num = num / 10;
		}
		return dnum;
	}
	public static void main(String[] args) {
		System.out.println(covertToDecimal(11101));
	}
}