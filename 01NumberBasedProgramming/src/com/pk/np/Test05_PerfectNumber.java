package com.pk.np;
/*
 * @Author:Pankaj Palai
 */

/*
 *  PERFECT NUMBER: Perfect number, a positive integer that is equal to the sum of its proper divisors. excluding the number itself
 *   The smallest perfect number is 6, which is the sum of 1, 2, and 3. Other perfect numbers are 28, 496, and 8,128.
 **/
public class Test05_PerfectNumber {

	public static void main(String[] args) {

		System.out.println(checkPerfect(28));
		printPerfect(1, 10000);

	}

	private static boolean checkPerfect(int num) {
		int sum = 0;
		if (num > 0) {
			for (int i = 1; i < num; i++) {
				if (num % i == 0) {
					sum = sum + i;
				}
			}
			if (sum == num) {
				return true;
			}

		}

		return false;
	}

	private static void printPerfect(int startRange, int endRange) {
		int num=0;
		for(int i=startRange;i<endRange;i++) {
			num=i;
			int sum=0;
			for(int j=1;j<num;j++) {
				if(num%j==0) {
					sum=sum+j;
				}
			}
			if(sum==num) {
				System.out.println(i);
			}
			
		}

	}

}
