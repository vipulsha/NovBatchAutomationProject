package com.pranav;
public class Palin {
	public static int getPalindrome(int n) {
		int sum = 0,temp = n;
		System.out.println("Enetred number:" + temp);
		System.out.println();

		while(n>0) {
			int rem = n%10;
			n = n/10;
			sum= (sum*10)+rem;
		}
		System.out.println("Reverse of a number is: "+sum);

		if(temp == sum) {
			System.out.println("The entered number is Palindrome");
		} else {
			System.out.println("The entered number is Not Palindrome");
		}
		return(sum);
	}

	public static void main(String[] args) {
		getPalindrome(12321);
	}
}