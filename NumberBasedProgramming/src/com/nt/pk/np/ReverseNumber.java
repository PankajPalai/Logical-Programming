package com.nt.pk.np;

import java.util.Scanner;

public class ReverseNumber {
	public static void revNum(int num) {
		int rem=0;
		int revNum=0;
		while(num>0) {
		rem=num%10;//3,9
		revNum=revNum*10+rem;//3,39,
		num=num/10;//529
		}
		System.out.println("reverse of the number is "+revNum);
		
		
		
	}
	
	
	public static void main(String[] args) {
		System.out.println("main start");
		System.out.print("enter a number:");
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();//5293
		revNum(num);
	}

}
