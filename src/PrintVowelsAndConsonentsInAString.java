import java.io.IOException;

public class PrintVowelsAndConsonentsInAString {

	public static void main(String[] args) throws IOException {
		String s = "India is my country".toLowerCase().replace(" ", "");
		String vowels = "aeiou";
		
		String resultVowels="",resultConsonents = "";
		
		for(int i=0; i<s.length(); i++) {
			char ch = s.charAt(i);
			if (vowels.contains(ch+"")) {
				if (! resultVowels.contains(ch+"")) {
					resultVowels = resultVowels+ch;	
				}
			} else {
				if (! resultConsonents.contains(ch+"")) {
					resultConsonents = resultConsonents+ch;	
				}
			}
		}
		
		System.out.println("Vowels: "+resultVowels);
		System.out.println("Consonents: "+resultConsonents);
	}
}
