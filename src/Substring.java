import java.io.IOException;

public class Substring {

	public static void main(String[] args) throws IOException {
		
		String s1 = "ABCDE";
		String s2 = "BCD";
		
		if (s2.length() > s1.length()) {
			System.out.println(s2+" is not substring of "+s1);
			System.exit(0);
		}
		
		for(int i=0; i<s1.length(); i++) {
			for(int j=0, k=i; j<s2.length() && k<s1.length(); j++,k++) {
				System.out.println(s1.substring(k, k+s2.length()));
				if (s2.charAt(0) == s1.charAt(k) && s1.substring(k, k+s2.length()-1) != null) {
					
				} else {
					
				}
			}
			
		}
		
		
		
		
	}
}
