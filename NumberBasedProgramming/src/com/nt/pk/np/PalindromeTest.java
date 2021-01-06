package com.nt.pk.np;

import java.util.Scanner;

/*
 * a palindrome number is a type of number ,if you reverse the number you will get the same number
 * 
 * Input:575
 * output:575 is a palindrome number
 */
public class PalindromeTest {
	public static void isPalindrome(int num) {
		int temp=num;
		int rem=0;
		int revNum=0;
		while(num>0) {
		rem=num%10;//		575%10=5,	57%10=7,	5%10=5
		revNum=(revNum*10)+rem;//5,57,575
		num=num/10;//		575/10=57,	57/10=5
		}
		num=temp;
		
		if(num==revNum) {
			System.out.println(num+" is a palindrome number");
		}
		else {
			System.out.println(num+" is not a palindrome number");
			
		}	
	}
	public static void printPalindrome(int startRange,int endRange) {
		int rem=0;
		int revNum=0;
		int num=0;
		int count=0;
		
		System.out.println();
		System.out.println("palindrome number between "+startRange+" and "+endRange+" : ");
		for(int i=startRange;i<=endRange;i++) {//i=101;i<=200;i++
			 num=i;							//temp=101
			
			while(num>0) {						//101>0,	10>0,
				rem=num%10;					   //rem=101%10=1,	10%10=0,,1%10=1
				revNum=(revNum*10)+rem;			//revNum=0*10+1=1,10,	101
				num=num/10;							//101/10=10,1,	1/10=0.1
			}
		
			if(revNum==i) {
				System.out.println(i);
				count++;
			}
			
			revNum=0;
		
		}
		System.out.println("total no of palindrome numbers in given range :"+count);
	}
		
	/*	
		if(num==revNum) {
			System.out.println(num+" is a palindrome number");
		}	
	}
}
*/	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("enter a number :");//575
		isPalindrome(sc.nextInt());
		
		System.out.println("enter start range");
		System.out.println("enter end range");
		printPalindrome(sc.nextInt(),sc.nextInt());
	}

}
