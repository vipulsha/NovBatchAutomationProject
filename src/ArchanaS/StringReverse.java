package ArchanaS;

public class StringReverse {
	public static void main(String[] args) {
		String S1 = "nitin";
		String reverse = "";
		
		int l= S1.length();
		System.out.println(l);
		for (int index=(l-1);index>= 0;index--) {
			//System.out.print(S1.charAt(index));
			
			reverse = reverse+S1.charAt(index);
		}
		System.out.println(reverse);
		
		if(S1.equals(reverse)) {
			System.out.println("This string is palindrome");	//original and reverse of the string should be same
		}
		else {
			System.out.println("not palindrome");
		}
	}
}
