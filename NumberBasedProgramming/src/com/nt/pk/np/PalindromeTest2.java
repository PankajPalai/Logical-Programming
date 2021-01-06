package com.nt.pk.np;

import java.util.Scanner;

/*
 * a palindrome number is a type of number ,if you reverse the number you will get the same number
 * 
 * Input:575
 * output:575 is a palindrome number
 */

//find palindfome numbers between 100 and 1000 
public class PalindromeTest2 {
			
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("palindrome number from 1-500 :");//323
	//	int num=sc.nextInt();
		//int originalNum=num;
	
		
		for(int i=1;i<500;i++) {
			
		int num=i;
		int revNum=0;
		int rem=0;
		while(num>0) {
		rem=num%10;//323 %10=3,2,3
		revNum=revNum*10+rem;//0*10+3=3,3*10+2=32,32*10+3
		num=num/10;//32,3,0
		}
		if(revNum ==i) {
			System.out.println(i);
			
		}
		
		}		
	}		
}
		
	
		


