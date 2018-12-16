
public class DecimalToBinary {

	public static void main(String[] args) {
		
		int n = 10;
		
		String s = "";
		
		while(n != 0) {
			int rem = n%2;
			n = n/2;
			s = rem+s;
		}
		
		System.out.println(s);
		
	}
}
