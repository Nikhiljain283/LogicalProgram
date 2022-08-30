package com.logicalprogram;

import java.util.Scanner;

public class StopWatch {

	public static void main(String[] args) {
		long start, end;
		double time;

		Scanner sc = new Scanner(System.in);
		System.out.println("Type any character to start the stopwatch");
		char s = sc.next().charAt(0);
		start = System.currentTimeMillis();
		System.out.println("Type any character to stop the stopwatch");
		char m = sc.next().charAt(0);
		end = System.currentTimeMillis();
		time = (end - start) / 1000.0;
		System.out.println("Time(in sec) = " + time);
	}
}
