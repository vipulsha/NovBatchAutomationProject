package com.Kiranmagar;
public class ReverseString {
	public static void main(String[] args) {
		String s1="India";
		String reverse = " ";
		int l = s1.length();
		for(int i =(l-1); i>=0;i--) {
			reverse= reverse+s1.charAt(i);
			
		}System.out.println(reverse);
	}

}
