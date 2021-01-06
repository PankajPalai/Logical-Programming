package com.nt.pk.np;

import java.util.Scanner;
//a perfect number is a kind of number where the sum of its factors(excluding the number itself)
//is equals to the given number
public class PerfectNumberTest2 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("enter a number :");//6
		int limit=sc.nextInt();
		for(int num=1;num<=limit;num++) {
		int sum=0;
			
		for(int i=1;i<num;i++) {
			if(num%i==0) {
				//System.out.println(i);
				sum=sum+i;
			}
		}
		if(num==sum) { 
			System.out.println(num+" is a perfect number");
		}
		
		
		}

	}

}
