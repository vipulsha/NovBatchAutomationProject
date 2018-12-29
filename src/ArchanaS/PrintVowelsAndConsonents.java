package ArchanaS;

public class PrintVowelsAndConsonents {
	public static void main(String[] args) {
		String s ="India is my country".toLowerCase().replace(" ","");
		String Vowels = "aeiou";
		
		String resultVowel ="", resultConsonent ="";
		
		for (int i=0; i<s.length();i++) {
			char ch = s.charAt(i);
			if(Vowels.contains(ch+"")) {
				if(!resultVowel.contains(ch+"")) {
					resultVowel = resultVowel+ch;
				}
			}
			else {
				if(!resultConsonent.contains(ch+"")) {
					resultConsonent = resultConsonent+ch;
				}
			}
		}
		System.out.println("Vowels are:  "+resultVowel);
		System.out.println("Consonents are:  "+resultConsonent);
	}
}
