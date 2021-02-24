package com.pk.np;

/*
 * An armstrong number is a number having sum of cube of all digit is equal to the number itself.
 * eg:371
 * (3*3*3)+(7*7*7)+(1*1*1)=371
 */
public class Test01_ArmstrongNumber {

	public static void main(String[] args) {
		// System.out.println(checkArmStrong(371));

		printArmstrong(1, 10000);

	}

	// Logic to check whether a number is armstrong number or not
	private static boolean checkArmStrong(int num) {// 371
		int rem = 0;
		int sum = 0;
		int temp = 0;
		int num1 = 0;
		temp = num;
		while (num > 0) {
			rem = num % 10; // 1,7
			num1 = rem * rem * rem; // 1,343
			sum = sum + num1; // 1
			num = num / 10; // 37
		}

		if (sum == temp) {
			return true;
		}

		return false;

	}

	// logic to print armstrong number between 100 to 1000

	private static void printArmstrong(int startRange, int endRange) {
		System.out.println("Armstrong numbers between " + startRange +" and "+endRange +" are :");


		for (int i = startRange; i <= endRange; i++) { // i=300;i<400;i++
			int rem = 0;

			int num = 0;
			int num1 = 0;
			int sum = 0;
			num = i; // num=300
			while (num > 0) { // 300>0
				rem = num % 10; // rem=300%10=0,0,3
				num1 = rem * rem * rem; // num1=0*0*0=0,0,27
				sum = sum + num1; // sum=0+num1=0,0,27:
				num = num / 10;
			}

			if (sum == i) {
				System.out.println(i);
			}

		}

	}

}
