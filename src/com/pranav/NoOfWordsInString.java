package com.pranav;
import java.util.Scanner;

public class NoOfWordsInString {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter your string: ");
		String ip = sc.nextLine();
		/*		int l = ip.split(" ").length;
		System.out.println(l);
		 */
		int count = 1;
		for (int i = 0; i < ip.length()-1; i++) {
			if ((ip.charAt(i) == ' ') && (ip.charAt(i + 1) != ' ')) {
				count++;
			}
		}
		sc.close();
		System.out.println("Number of words in a string = " + count);
	}
}