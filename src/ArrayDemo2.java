
public class ArrayDemo2 {
	public static void main(String[] args) {
		//How to declare array
		int[] arr1 = new int[5]; //Declaration
		int arr2[]=new int[5]; //Declaration
		int[] arr3 = new int[] {1,2,3,4,5};  //Declaration and Initialization
		
		for(int i=0 ;i<arr1.length;i++){
			arr1[i]=10+i;
		}
		for(int a:arr1){
			System.out.println(a);
		}
	}
	

}
