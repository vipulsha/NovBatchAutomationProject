
public class VowelsCon {
	public static void main(String[] args) {
		String D = "india is my country".toLowerCase().replace(" ", "");
		//int len=D.length();
		//System.out.println(len);
		//vowels= iaou
		//con= nd s my ctr
		String vowels = "AIOUaeiou";
		String ResultVowels ="",ResultCon ="";

		for(int i=0 ;i<D.length();i++){
			char ch =D.charAt(i);
			if(vowels.contains(ch + "")){
				if(! ResultVowels.contains(ch+"")){
					ResultVowels=ResultVowels+ch;
				}
			}
			else{
				if(!ResultCon.contains((ch + ""))){
					ResultCon=ResultCon+ch;
				}

			}
		}
		System.out.println(ResultVowels);
		System.out.println(ResultCon);
	}
}
