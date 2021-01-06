package com.nt.pk.np;

import java.util.Scanner;

public class StrongNumberTest2 {
	
	public static void checkStrong(int num) {
		int temp=num;//temp=200
		int rem=0;
		int sum=0;
		
		while(temp>0) {
			
			int fact=1;
			rem=temp%10;
			for(int i=1;i<=rem;i++) {
				fact=fact*i;
			}
			sum=sum+fact;
			temp=temp/10;
		}
		if(sum==num) { 
			System.out.println(num+" is a strong number ");
		}
		else
			System.out.println(num+" is not a strong number ");
			
	}
	
	public static void printStrong(int startRange,int endRange) {
		int rem=0;
		int sum=0;
		
		
		for(int i=startRange;i<=endRange;i++) {
			
			int temp=startRange;
			
			while(temp>0) {
				int fact=1;
				rem=temp%10;
				for(int j=1;j<=rem;j++) {
					fact=fact*j;
				}
				sum=sum+fact;
				temp=temp/10;
				
			}
			
			System.out.println("sum"+sum);
			System.out.println("start range"+startRange);
			System.out.println("endRange"+endRange);
			System.out.println("rem"+rem);
			System.out.println("i :"+i);
			if(sum==startRange)
				System.out.println(i);
			
		}
		
	}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a number : ");//145
		checkStrong(sc.nextInt());
	printStrong(142,146);

	}

}
