public class Pattern3 {
	
	public static void main(String[] args) {
		int n = 4;
		
		for(int row=1; row<=n; row++) {
			// spaces
			for(int space=1; space<=(row-1); space++) {
				System.out.print(" ");
			}
			
			// stars
			for(int star=n; star>=row; star--) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

}