
public class StringFirst {
	public static void main(String[] args) {
		String s1="ABC";
		String s2="ABc";
		String s3=new String("ABC");
		String s4=new String("abc");
		
		if(s1.equals(s2)){
			System.out.println("Equal");
		}
		else{
			System.out.println("Not Equal");
		}
		System.out.println("Hashcode of S3:" +s1.hashCode());
		System.out.println("Hashcode of S4:" +s2.hashCode());
		s1=s1.replaceAll("BC", "EF");
		//s1.replace("BC", "EF"); //Because s1 is- immutable
		System.out.println(s1);
	}

}
