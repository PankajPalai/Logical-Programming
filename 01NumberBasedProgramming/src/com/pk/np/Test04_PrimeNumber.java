package com.pk.np;
/*
 * @Author:Pankaj Palai
 */

/*
 *  PRIME NUMBER: A number that is divisible only by itself and 1 (e.g. 2, 3, 5, 7, 11)
 **/
public class Test04_PrimeNumber {

	public static void main(String[] args) {

		System.out.println(checkPrime(2));
		printPrime(1, 1000);

	}

	private static void printPrime(int num1, int num2) {
		int count = 0;
		for (int i = num1; i <= num2; i++) {
			if (checkPrime(i)) {
				System.out.println(i);
				count++;
			}
		}

		System.out.println("count :" + count);

	}

	private static boolean checkPrime(int num) {
		int count = 0;
		if (num > 1) {
			for (int i = 1; i <= num; i++) {
				if (num % i == 0) {
					count++;

				}
			}
			if (count == 2)
				return true;

		}

		return false;
	}
}
