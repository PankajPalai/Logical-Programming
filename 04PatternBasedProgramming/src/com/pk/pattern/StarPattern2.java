package com.pk.pattern;

public class StarPattern2 {

	/*
	 * print the pattern 1 21 321 4321 54321
	 * 
	 * 
	 *
	 */
	public static void main(String[] args) {

		for (int i = 1; i <= 5; i++) {// 1,2,3,4,5
			for (int j = i; j >= 1; j--) {// 2,1,
				System.out.print(j);// 2

			}
			System.out.println();

		}

	}

}
