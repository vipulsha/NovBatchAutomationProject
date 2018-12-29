
public class Re {
	public static void main(String[] args) {
		int n=4;
		for(int row=1;row<=n;row++){
			for(int space=1;space<=(row-n);space++){
				System.out.print(" ");
			}
			for(int star=n;star>=row;star--){
				
				System.out.print(star);
			}
			System.out.println();
		}
	}

}
