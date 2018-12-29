
public class ReverseString {
	public static void main(String[] args) {
		String s1="NitiN";
		String Reverse ="";
		int l=s1.length();
		
		//System.out.println(l);
		for(int i=(l-1) ;i >=0 ; i--){
			//System.out.print(s1.charAt(i));
			Reverse = Reverse+s1.charAt(i);
			
		}
		if(s1.equalsIgnoreCase(Reverse))
		//if(s1.equals(Reverse))
			{
			System.out.println("Palimdrome");
			
		}
		else{
			System.out.println("Not Pallimdrome");
		}
	}

}
