package com.pranav;

public class decimaltobinary {
	public static String decitobin(int decimal) {
		String binary="";

		while(decimal!=0) {
			binary=(decimal%2)+binary;
			decimal=decimal/2;
		}
		return binary;
	}
	public static void main(String[] args) {
		System.out.println("Binary : "+decitobin(10));
	}
}