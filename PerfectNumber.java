package com.logicalprogram;

import java.util.Scanner;

public class PerfectNumber {
	
	public static void main(String[] args) {
		int sum = 0;
		
		System.out.print("Enter the number : ");
		Scanner scanner = new Scanner(System.in);
		int num = scanner.nextInt();
	
	   for(int i = 1; i <= (num-1); i++) {
		  if( num%i == 0 ) {
			  System.out.println("factors are "+i);
			  sum += i;
		  }
	   }
	   System.out.println("sum of factors : "+sum);
	   if(num == sum) {
		   System.out.println("It is perfect number");
	   }else
		   System.out.println("It is not a perfect number");
	}

}
