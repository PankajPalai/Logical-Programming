package com.pk.np;

/*
 * What Is The Fibonacci Sequence?
The Fibonacci sequence is a series of numbers where a number is the addition of the last two numbers, starting with 0, and 1.

The Fibonacci Sequence: 0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55…
 */
public class Test11_FibonacciSeries {

	public static void main(String[] args) {
		fibbonaciTerm(8);
		
	}

	private static void fibbonaciTerm(int lastTerm) {
		
		int a=0;
		int b=1;
		int c=0;
				
			for(int i=0;i<lastTerm;i++) {
				
			    c=a+b;
				a=b;
				b=c;
				System.out.println(a);
			}
		
		
	}

}
