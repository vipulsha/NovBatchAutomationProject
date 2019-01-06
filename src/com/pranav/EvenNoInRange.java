package com.pranav;
import java.util.Scanner;

public class EvenNoInRange {
	public static void main(String[] args) {
		System.out.print("Enter the Range:	");
		Scanner s = new Scanner(System.in);
		int range = s.nextInt();

		System.out.println("Printing Even numbers upto " + range);

		for(int i=0; i <= range; i++){
			if( i % 2 == 0){
				System.out.print(i + " ");
			}
		}
		s.close();
	}
}