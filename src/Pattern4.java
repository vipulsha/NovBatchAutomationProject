
public class Pattern4 {
	
	public static void main(String[] args) {
		int n = 4;
		
		int cnt=1;
		for(int row=1; row<=(n*2)-1; row++, cnt=(row<=n?cnt+2:cnt-2)) {
			if (row<=n) {
				for(int space=1; space<=(n-row); space++) {
					System.out.print(" ");
				}
				/*for(int star=1;star<=((2*row)-1);star++) {
					System.out.print("*");
				}*/
				for(int star=1;star<=cnt;star++) {
					System.out.print("*");
				}
			} else {
				for(int space=1;space<=row-n; space++) {
					System.out.print(" ");
				}
				for(int star=1;star<=cnt;star++) {
					System.out.print("*");
				}
			}
			System.out.println();
		}
	}

}
