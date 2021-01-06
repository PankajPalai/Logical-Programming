package com.nt.pk.np;

//develope a program to find factorial of a number

public class FactorialTest {
	
	public static void findFactorial(final int num) {
		int fact=1;
		for(int i=1;i<=num;i++) {
		fact=fact*i;	
		}
		
		System.out.println("Factorail of "+num+" is "+fact);
	}
	
	
	
	

	public static void main(String[] args) {
		findFactorial(3);

	}

}
