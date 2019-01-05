package com.pranav;
public class ArrayDemo {
	public static void main(String[] args) {

		//How to declare array
		int[] arr1 = new int[5];
		int arr2[] = new int[5];
		int[] arr3 = {1,2,3,4,5}; //Declaration + Initialization
		String[] str = new String[3];

		for(int i=0;i<arr1.length;i++) {
			arr1[i]= i+10;
		}

		//foreach loop
		for (int i : arr3) {
			System.out.println(i);
		}
	}
}