package ArchanaS;

public class CountNoOfWordsInString {
	public static void main(String[] args) {
		String s = " India is my country ".trim();
		int result=1; 
		
		String space = " ";
		
		for(int i=0;i<s.length();i++) {
			char ch = s.charAt(i);
			if(space.contains(ch+"")) {
					result = result+1;
			}
		}
		System.out.println("Number of words are : "+result);
	}
}
