package com.pk.np;

/*
 *Strong number is a number whose sum of all digits' factorial is equal to the number 'n'. ... So, to find a number whether its strong number,
 * we have to pick every digit of the number like the number is 145 then we have to pick 1, 4 and 5 now we will find factorial of
 *  each number i.e, 1! = 1, 4! = 24, 5! = 120.*/
public class Test03_StrongNumber {

	public static void main(String[] args) {

		 System.out.println(checkStrong(2));
		printStrong(1,10000);

	}private static boolean checkStrong(int num) {
		int temp=num;
		int sum=0;
		while(num>0) {
		int rem=num%10;
		int fact=1;
		
		for(int i=1;i<=rem;i++) {
			fact=fact*i;
		}
		sum=sum+fact;
		num=num/10;
		}
		
		return temp==sum;
	}

	/*

	private static boolean checkStrong(int num) {
		int temp = num;
		int sum = 0;
		int rem = 0;
		while (num > 0) {
			int fact = 1;
			rem = num % 10;
			for (int i = 1; i <= rem; i++) {
				fact = fact * i;
			}
			num = num / 10;
			sum = sum + fact;
		}

		return sum == temp;

	}
	*/

	/*
	 * //approach 1 for printing strong number in a given range private static void
	 * printStrong(int startRange, int endRange) { for(int
	 * i=startRange;i<=endRange;i++) { if(checkStrong(i)) { System.out.println(i); }
	 * }
	 * 
	 * }
	 */
	


	private static void printStrong(int startRange, int endRange) {
		int num=0;
		
		for (int i = startRange; i <= endRange; i++) {
			num = i;
			int sum = 0;
			
			while (num > 0) {
				int fact = 1;
				
				int rem = num % 10;

				for (int j = 1; j<= rem; j++) {
					fact = fact * j;
				}
				
				num = num / 10;
				sum = sum + fact;
			}
			
			

			//System.out.println("i :" + i+ " sum :" + sum);
			if (sum == i) {
				System.out.println(i);
			}

		}
	}

}
