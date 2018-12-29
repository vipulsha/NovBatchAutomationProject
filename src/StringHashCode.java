
public class StringHashCode {
	public static void main(String[] args) {
		String S3 = new String("ABC");
				
		String S4 = new String("ABC");
		
		if (S3==S4) {
			System.out.println("Equal");
		}
		else {
			System.out.println("Not Equal");
		}
		
		System.out.println("Hashcode of S3: "+S3.hashCode());
		System.out.println("Hashcode of S4: "+S4.hashCode());
		
		if (S3.equals(S4)) {
			System.out.println("Equal");
		}
		else {
			System.out.println("Not Equal");
		}
	}
}
