
public class Decimal {
	public void DecimalToBinary(int n){
		int mod;
		String str ="";
		while(n!=0){
			str = n%2+str;
			//mod=n%2;
			//System.out.println(mod);
			
			n=n/2;
		}
		System.out.println(str);
	}
	public static void main(String[] args) {
		Decimal d = new Decimal();
		d.DecimalToBinary(10);
	}
}
