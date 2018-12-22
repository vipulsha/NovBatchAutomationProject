
public class PatternPrograms {

	public static void main(String[] args) {
		/**
		 * Program to print below pattern
		 * *
		 * **
		 * ***
		 * ****
		 * 
		 */
		
		int n = 4;
		
/*		// For maintaining rows
		for(int row=1; row<=n; row++) {
			for(int star=1; star<=row; star++) {
				System.out.print("*");
			}
			System.out.println();
		}

*/		

		/****
		 * 
		 * 1234
		 * 123
		 * 12
		 * 1
		 * 
		 */
		
		for(int row=n; row>0; row--) {
			for(int star=1; star<=row;star++) {
				System.out.print(star);
			}
			System.out.println();
		}
		
	}
}
