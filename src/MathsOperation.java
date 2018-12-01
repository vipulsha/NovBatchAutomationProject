
public class MathsOperation {
	
	// Function declaration
	void add(int a, int b) {
		System.out.println(a+b);
	}
	
	int sub(int a, int b) {
		return a-b; // returning a value from function
	}
	
	public static void main(String[] args) {
		MathsOperation o = new MathsOperation();
		o.add(10, 20); // calling a function & passing values
		
		int res = o.sub(20, 10); // capturing value returned by a function
		
		System.out.println(res);
		
	}
}
