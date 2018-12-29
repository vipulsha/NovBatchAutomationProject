
public class ReverseOfString {

	public static void main(String[] args) {
		String s1 = "Nitin";
		String reverse = "";
		
		int l = s1.length();
		
		for(int i=(l-1); i >= 0; i--) {
			reverse = reverse+s1.charAt(i);
		}

		if (s1.equalsIgnoreCase(reverse)) {
			System.out.println("Palindrome");
		} else {
			System.out.println("Not Palindrome");
		}
		
//		System.out.println(reverse);
		
	}
}
