
public class StringDemo {
	
	public static void main(String[] args) {
		
		String s1 = "ABC";
		String s2 = "ABC";
		String s3 = new String("ABC");
		String s4 = new String("ABC");
		
/*		if (s3.equals(s4)) {
			System.out.println("Equal");
		} else {
			System.out.println("Not Equal");
		}*/
		
/*		System.out.println("Hashcode of S3: "+s3.hashCode());
		System.out.println("Hashcode of S4: "+s4.hashCode());
		System.out.println("Hashcode of S2: "+s2.hashCode());
		
		Employee e1 = new Employee();
		Employee e2 = new Employee();
		
		System.out.println(e1.hashCode());
		System.out.println(e2.hashCode());*/
		
/*		s1 = s1.replace("BC", "EF");
		System.out.println(s1);
*/		
		StringBuffer sb = new StringBuffer("ABC");
		sb.reverse();
		System.out.println(sb);
		
		StringBuilder stBuilder = new StringBuilder("ABC");
		stBuilder.reverse();
		System.out.println(stBuilder);
		
		
		sb.append("PQR");
		System.out.println(sb);
		
		
		
		
		
		
		
		
	}

}
