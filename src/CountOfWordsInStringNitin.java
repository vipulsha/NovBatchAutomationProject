
public class CountOfWordsInStringNitin {
	public static void main(String[] args) {
		String s = "This is a table this table is wooden".toLowerCase();

		String[] arr = s.split(" ");

		String testedStrings = "";

		for(int i=0; i<arr.length; i++) {
			String word1 = arr[i];
			int cnt = 1;

			if (! testedStrings.contains(" "+word1+" ")) {
				for(int j=i+1; j<arr.length; j++) {
					String word2 = arr[j];

					if (word1.equalsIgnoreCase(word2)) {
						cnt++;
					}
				}
				testedStrings = testedStrings+" "+word1+" ";
				System.out.println(word1+" ==> "+cnt);
			}
		}
	}
}