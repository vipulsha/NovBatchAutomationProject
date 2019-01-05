package com.pranav;
import java.util.Scanner;

public class VowelsConsonents {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the String: ");
		String s1 = sc.nextLine();
		System.out.println("Original String: "+s1);
		s1=s1.toLowerCase().replace(" ", "");
		String vowels= "AEIOUaeiou";
		String resultvowels ="";
		String resultconsonents="";
		int len =s1.length();

		for(int j=0;j<len;j++) {
			Character ch = s1.charAt(j);
			if(vowels.contains(ch.toString())) {
				if(!resultvowels.contains(ch+"")) {
					resultvowels+=ch;
				}
			}
			else {
				if(!resultconsonents.contains(ch+"")) {
					resultconsonents+=ch;
				}
			}
		}
		sc.close();
		System.out.println();
		System.out.println("Vowels: "+resultvowels);
		System.out.println("Consonents:  "+resultconsonents);
	}
}