package com.logicalprogram;

import java.util.Scanner;

public class ReversingNumber {

	public static void main(String[] args) {
		
		int revNum = 0;
		Scanner scn = new Scanner(System.in);
		System.out.print("Enter the number : ");
		int num = scn.nextInt();
		
		while(num != 0) {
			int remainder = num%10;
			revNum = revNum*10 + remainder;
			num = num/10;
		}
		
		System.out.println("Reverse number : "+revNum);
	}

}
