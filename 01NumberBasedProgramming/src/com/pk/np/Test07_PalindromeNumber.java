package com.pk.np;

/*
 *PALINDROME NUMBER:: A Palindrome number is a number by reversing the number we will get the same number
 *eg: 525,7887,956659
 *
 **/
public class Test07_PalindromeNumber {

	public static void main(String[] args) {
		System.out.println(checkPalindrome(75457));

		printPalindrome(1,1000);

	}
	
	//printing palindrome numbers in a given range

	private static void printPalindrome(int startRange, int endRange) {
		int num=0;
		
		for(int i=startRange;i<endRange;i++) {
			int rem=0;
			int revNum=0;
			num=i;
			while(num>0) {
				rem=num%10;
				revNum=revNum*10+rem;
				num=num/10;
			}
			if(i==revNum) {
				System.out.println(i);
			}
			
		}
		
		
		
	}
//checking whether a num is palindrome or not
	private static boolean checkPalindrome(int num) {//434
		int rem=0;
		int revNum=0;
		int temp=num;
		while(num>0) {//434>0,43>0
			rem=num%10;	//4,3,
			revNum=revNum*10+rem;//4,43,
			num=num/10;	//43,
		}
		
		if(temp==revNum) {
		return true;
		}
		return false;
	}
	
	//we can use the first method to print  the nubmers easily

	}


