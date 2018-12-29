
public class BinaryToDecimal {
	
	public static void main(String[] args) {
		int n = 1010;
		int cnt = 0;
		int sum = 0;
		MathOperations o = new MathOperations();

		while( n != 0) {
			int rem = n%10;
			n = n/10;
			sum = sum+rem*(o.getPower(2, cnt++));
		}
		
		System.out.println("Decimal: "+sum);
	}
}
