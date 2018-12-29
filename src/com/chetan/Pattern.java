package com.chetan;

public class Pattern {
	public static void main(String[] args) {
		int n=4;
		for(int row=n;row>0;row--) {
			for(int star=1;star<=row;star++) {
				System.out.print(star);
			}
				System.out.println();
		}		
	}


}
