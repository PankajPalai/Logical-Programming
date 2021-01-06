package com.nt.pk.np;
/*
 * develope a  program to print prime numbers between 200-350
 */
 class PrimeNumber2{
	 boolean flag=false;
	 public static boolean isPrime(int num) {
		 if(num<2)
			 return false;	 
		 for(int i=2;i<num;i++) {
			 if(num%i==0) {
				return false;
			 }
		 }
		 return true;	 
	 }
	 public static void printsPrime(int n) {
		 for(int i=0;i<=n;i++) {
			 if(isPrime(i))
				 System.out.println(i+" ");		 
		 }
		 
	 }
	 
	 public static void main(String[] args) {
		 isPrime(4);
		 printsPrime(10);
		
	}
	 
 }