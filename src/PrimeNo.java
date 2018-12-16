
public class PrimeNo {
	public boolean isPrimeNo(int n) {
		for(int i=2; i<=(n/2); i++) {
			if (n%i == 0) {
				return false;
			}
		}
		return true;
	}
	
	public static void main(String[] args) {
		PrimeNo o = new PrimeNo();
		boolean b = o.isPrimeNo(11);
		
		if (b) {
			System.out.println("No is prime");
		} else {
			System.out.println("No is NOT prime");
		}
		
	}
}
