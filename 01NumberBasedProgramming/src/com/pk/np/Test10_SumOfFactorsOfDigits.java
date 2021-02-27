package com.pk.np;

/*
 * print sum of factors of each digit in a number.
 */
public class Test10_SumOfFactorsOfDigits {

	public static void main(String[] args) {
		factorSum(1234);
	}

	private static void factorSum(int num) {//54
		int rem = 0;
		
		int sum = 0;
		while (num > 0) {			//	54>0
			int fact = 1;

			rem = num % 10;			//4
			for (int i = 1; i <= rem; i++) {//1 to  4,
				fact = fact * i;			
			}
			sum = sum + fact;
			num = num / 10;
		}
		System.out.println("sum :" + sum);

	}

}
