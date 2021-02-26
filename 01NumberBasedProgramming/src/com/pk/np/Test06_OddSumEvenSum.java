package com.pk.np;



/*
 *  PERFECT NUMBER: Perfect number, a positive integer that is equal to the sum of its proper divisors. excluding the number itself
 *   The smallest perfect number is 6, which is the sum of 1, 2, and 3. Other perfect numbers are 28, 496, and 8,128.
 **/
public class Test06_OddSumEvenSum {

	public static void main(String[] args) {

		System.out.println(oddSum(3971742));

		System.out.println(evenSum(642579));
	}

	private static int evenSum(int num) {
		int rem=0;
		int sum=0;
		while(num>0) {
			rem=num%10;
			if(rem%2==0) {
				sum=sum+rem;
			}
			num=num/10;
		}
			
		
		return sum;
	}

	private static int oddSum(int num) {
		int rem=0;
		int sum=0;
		while(num>0) {
			rem=num%10;
			if(rem%2!=0) {
				sum=sum+rem;
			}
			num=num/10;
			
		}
		
		return sum;
	}

	
	}


