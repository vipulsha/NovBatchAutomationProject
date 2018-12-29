
public class GetBinaryNUmber {

	void reverseBinary(int n){
		String str = "";

		while(n!=0) {
			str = n%2+str;		
			n=n/2;
		}
		System.out.println(str);
	}
	public static void main(String[] args) {
		GetBinaryNUmber num = new GetBinaryNUmber();
		num.reverseBinary(42);
	}
}
