
public class ReverseNo {
	public static void main(String[] args) {
	/*	int a=899;
		int temp=a;
		while(temp>0){
			System.out.println(temp%10);
			temp=temp/10;
		
		}*/
		/*int e=12345;
		String ReverseNumber="";
		while(e>0){
			ReverseNumber=ReverseNumber+ e%10;
			e=e/10;
		}
		System.out.println("ReverseNumber :"+ReverseNumber);*/
		/*int e=12345;
		int add=0;
		while(e>0){
			add=add+ e%10;
			e=e/10;
		}
		System.out.println("addition :"+add);*/
		int a=153;
		int count=0;
		int temp=a;
		double result=0;
		while(temp>0){
			count++;
			temp=temp/10;
		}
		temp=a;
		while(temp>0){
			int digit=temp%10;
			result=result+Math.pow(digit, count);
			
			temp=temp/10;
		}
		System.out.println(result);
		
		int n=1256;
		String str=Integer.toString(n);
		for(int i=str.length()-1;i>-1;i--){
			System.out.println(str.charAt(i));
		}
	}
}
