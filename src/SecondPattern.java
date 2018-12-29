
public class SecondPattern {
	public static void main(String[] args) {
		for(int row=1;row<=4;row++){
			for(int star=4;star>=row;star--){
				System.out.print("*");
			}
			System.out.println();
		}
	}

}
