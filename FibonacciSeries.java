package com.logicalprogram;

import java.util.Scanner;

public class FibonacciSeries {

	public static void main(String[] args) {
		
		int num1 = 0;
		int num2 = 1;
		int num3;
		int count = 3;
		
		System.out.print("Enter number of times series must continue : ");
		Scanner scn = new Scanner(System.in);
		int times = scn.nextInt();
		System.out.print("0 1 ");
		while(count <= times) {
			num3 = num1 +num2;
			num1 = num2;
			num2 = num3;
			System.out.print( num3+" ");
			count++;
		}
		
		
	}
}
