package ArchanaS;

public class CHeckSubString {
	
	public static void main(String[] args) {

		String s1 = "ABCDEFGH";
		String s2 = "CDE";
		
		if(s2.length() > s1.length()) {
			System.out.println("Not substring");
		}
		
		Boolean IsSubstring = false;
		for(int i = 0; i <(s1.length()-s2.length()); i++) {
			int cnt = 0;
			for(int j=0;j<s2.length();j++) {
				if(s1.charAt(i) == s2.charAt(j)) {
					cnt++;
				}
				else {
					break;
				}
			}
			if(cnt == s2.length()) {
				IsSubstring = true;
			}
		}
		if(IsSubstring) {
			System.out.println("This is Substring");
		}
		else {
			System.out.println("This is not a substring");
		}		
	}
}