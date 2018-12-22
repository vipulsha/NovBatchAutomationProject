
public class Pattern2 {

	public static void main(String[] args) {
		int n = 10;
		
		// Managing rows
		for(int row=1; row<=n; row++) {
			// manage spaces
			for(int space=1; space<=(n-row);space++) {
				System.out.print(" ");
			}
			for(int star=1;star<=row;star++) {
				System.out.print("*");
			}
			System.out.print("\n");
		}
	}
}
