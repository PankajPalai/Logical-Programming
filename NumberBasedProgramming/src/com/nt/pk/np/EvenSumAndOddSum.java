package com.nt.pk.np;

import java.util.Scanner;

public class EvenSumAndOddSum {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("enter a number :");//8329
		int num=sc.nextInt();
		int rem=0;
		int evenSum=0;
		int oddSum=0;
		while(num>0) {
		 rem=num%10;//9
		if(rem%2 ==0) {//false
			 evenSum=evenSum+rem;
		}
		else {
			oddSum=oddSum+rem;
		}
		
		num=num/10;

		}
		System.out.println("oddSum :"+oddSum);
		System.out.println("evenSum :"+evenSum);
	}

}
