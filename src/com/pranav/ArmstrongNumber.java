package com.pranav;
import java.util.Scanner;

public class ArmstrongNumber {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number: ");
		int inputNumber = sc.nextInt();
		int digit, cubeSum = 0;
		int tempNumber = inputNumber;

		while (tempNumber != 0){
			digit = tempNumber % 10;
			cubeSum = cubeSum + (digit*digit*digit);
			tempNumber = tempNumber / 10;   
		}
		sc.close();
		if(cubeSum == inputNumber)
			System.out.println(inputNumber + " is an Armstrong Number.");
		else
			System.out.println(inputNumber + " is not an Armstrong Number."); 
	}
}