package com.pranav;
import java.io.IOException;

public class Substring {
	public static void main(String[] args) throws IOException {
		String s1 = "india is my country  ";
		String s2 = "country";
		int l1 = s1.length();
		int l2 = s2.length();

		if(l2 > l1) {
			System.out.println("Not a substring");
			System.exit(0);
		}
		boolean isSubstring = false;
		for(int i=0; i<=l1-l2; i++) {
			int cnt=0;

			for(int j=0,k=i;j<l2;j++,k++) {
				if(s1.charAt(k) == s2.charAt(j)) {
					cnt++;
				} else {
					break;
				}
			}

			if(cnt == l2) {
				isSubstring = true;
			}
		}

		if(isSubstring) {
			System.out.println("Substring");
		} else {
			System.out.println("Not a Substring");
		}
	}
}