package com.logicalprogram;

import java.util.Scanner;

public class PrimeNumber {
	
	public static void main(String[] args) {
	
	System.out.print("Enter the number : ");	
	Scanner scn = new Scanner(System.in);
	int num = scn.nextInt();
	
	for(int i = 2; i <= num-1; i++) {
		if(num%i == 0) {
			System.out.println("Number is not a prime number");
			break;
		}else {
			System.out.println("Number is a prime number");
			break;
		}
	}
	}
}	