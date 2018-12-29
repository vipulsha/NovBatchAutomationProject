
public class SpacesPattern {
	public static void main(String[] args) {
		//managing rows
		int n=9;
		for(int row=1;row<=n;row++){
			for(int space=1;space<=(n-row);space++){
				System.out.print(" ");
			}
			/*for(int star=1;star<=row;star++){
				System.out.print("*");*/
			for(int no=row; no>=1 ;no--){
				System.out.print(no);
				

			}
			System.out.println();

		}
	}
}
