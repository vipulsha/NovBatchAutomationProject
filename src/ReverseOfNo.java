
public class ReverseOfNo {
	
	public static void main(String[] args) {
		
		int n = -1234;
		
		/*while(n != 0) {
			System.out.print(n%10);
			n = n/10;
		}*/
		
		/*String reverseStr = "";
		while(n != 0) {
			reverseStr = reverseStr+(n%10);
			n = n/10;
		}*/
		
		int reverseNo=0;
		int rem = 0;
		
		while(n != 0) {
			rem = n%10;
			n = n/10;
			reverseNo = reverseNo * 10 + rem;
		}
		
		System.out.println(reverseNo);
		
		
		
		
	}

}
