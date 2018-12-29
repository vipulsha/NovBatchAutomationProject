package ArchanaS;

public class PrintVowels {
	public static void main(String[] args) {
		String S1 = "India is my Country".toLowerCase().replace(" ", "");
		
		//Vowels: Iiaiou
		//Consonenets: ndsmyCntry
		
		String Vowels ="";
		String Consonent="";
		
		int l =S1.length();
		char S2;
		for(int i=0; i<l; i++) {
			S2 = S1.charAt(i);
			if(S2 == 'a'){
				Vowels = Vowels+S2;	
			}
			else if (S2 == 'e') {
				Vowels = Vowels+S2;
			}
			else if(S2 == 'i') {
				Vowels = Vowels+S2;
			}
			else if(S2 == 'o') {
				Vowels = Vowels+S2;
			}
			else if (S2 == 'u') {
				Vowels = Vowels+S2;
			}
			else {
				Consonent = Consonent+S2;
			}
		}
		System.out.println("Vowels :" +Vowels);
		System.out.println(Consonent);
	}
}
