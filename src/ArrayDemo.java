import java.util.ArrayList;

public class ArrayDemo {
	public static void main(String[] args) {
		
		// How to declare Array
		int[] arr1 = new int[5]; // Way#1 ==> Declaration
		int arr2[] = new int[5]; // Way#2 ==> Declaration
		int[] arr3 = new int[] {1,2,3}; // Way#3: Declaration+Initialization
		
		for(int i = 0; i<arr1.length; i++) {
			arr1[i] = i+10;
		}
		
		// Foreach loop
		for(int a :arr1) {
			System.out.println(a);
		}
		
		
	}
}
