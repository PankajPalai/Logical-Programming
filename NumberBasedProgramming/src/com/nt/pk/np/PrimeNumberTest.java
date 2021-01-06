package com.nt.pk.np;

import java.util.Scanner;

/*1.develope a program to check whether a number is 
prime number or not. Print and count the prime numbers between 1 to 100.
*/
class PrimeNumberTest{
	
	public static void checkPrime(int num) {
		Scanner sc=new Scanner(System.in);
		int count=0;
		System.out.print("enter a number:");
		num=sc.nextInt();
		if(num<2) {
			System.out.println("invalid entry,Prime number starts from 2");
		}
		else {
		for(int i=2;i<=num;i++) {
			if(num%i==0) {
				count++;	
			}
		}
		if(count==1)
			System.out.println(num+" is a prime number");
		else
			System.out.println(num+" is not a prime number");
		}	
	}
	

	/*	System.out.println("enter start range and end range");
		Scanner sc=new Scanner(System.in);
		startRange=sc.nextInt();
		endRange=sc.nextInt();
		*/
/*	public static void printPrime(int startRange,int endRange) {
		System.out.println("prime numbers between "+startRange+" and "+endRange+ ": ");
		int count=0;
		for(int i=startRange;i<=endRange;i++) {
			System.out.println("i="+i);
			for(int j=2;j<=i;j++) {
				
				if(i%j==0) { 
					count++;
				}
				if(count==1) {
					System.out.println("i="+i);
					
				}
				
				
			}
			
			
			
			
			
			*/
			


	public static void main(String[] args) {
		System.out.println("welcome to Prime number project");
		//PrimeNumberTest obj= new PrimeNumberTest();
	checkPrime(5);
	}
	
}