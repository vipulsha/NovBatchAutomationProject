
public class Pattern3 {
	
	public static void main(String[] args) {
		int n = 4;
		
		for(int row=1; row<=n;row++) {
			//spaces
			for(int space=1;space<=(n-row);space++) {
				System.out.print("#");
			}
			
			// numbers
			for(int no=row; no>=1;no--) {
				System.out.print(no);
			}
			System.out.println();
		}
	}

}
