
// number that is the sum of its own digits each raised to the power of the number of digits.
public class ArmstrongNo {
	public static void main(String[] args) {
		int n = 1634;
		int temp = n;
		
		// Find out no of digits in no
		int length = Integer.toString(n).length();
		
		// Logic for splitting last digit from no
		int sum = 0;
		MathOperations ops = new MathOperations();
		
		while(n != 0) {
			int rem = n%10;
			n = n/10;
			sum = sum + ops.getPower(rem, length);
		}
		
		if (temp == sum) {
			System.out.println(temp+" is armstrong no");
		} else {
			System.out.println(temp+" is not armstrong no");
		}
	
	}
}
