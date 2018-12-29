
public class FirstPatternProg {
	
	public static void main(String[] args) {
		/*for (int row = 1; row<=4;row++) {
			for(int star = 4;star >=row;star--) {
				System.out.print("*");
			}
			
			for(int star = 1; star<=row;star++) {
			System.out.print("*");
			}
			
			
			for(int star = 4;star >=row;star--) {
			System.out.print(star);
			}
			
			for(int star = 1; star<=row;star++) {
			System.out.print(star);
			}
			
			System.out.println();
		}*/
		/*==========================
				1234
				123
				12
				1
		============================*/
/*		for(int row=4;row>=1;row--) {
			for(int star=1;star<=row;star++) {
				System.out.print(star);
			}
			System.out.println();
		}*/
		//=================================
		/*###*
		  ##**
		  #***
		  ****  */
		
		/*int n=4;
		for(int row=1;row<=n;row++) {
			for(int space=1; space<=(n-row);space++) {
				System.out.print(" ");
			}
			for (int star=1; star<=row;star++) {
				System.out.print("*");
			}
			System.out.println();
		}*/
		/*=================================
		 *    1
  			 21
 			321
		   4321
		==================================
		*/
		int n =5;
		for(int row=1;row<=n;row++) {
			for(int space=1; space<=(n-row);space++) {
				System.out.print(" ");
			}
			for (int no=row; no>=1;no--) {
				System.out.print(no);
			}
			System.out.println();
		}
	}
}
