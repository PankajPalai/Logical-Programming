package com.nt.pk.np;

import java.util.Scanner;

public class StrongNumberTest3 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("enter a number : ");
		int num=sc.nextInt();
		int temp=num;
		int sum=0;
		while(num>0) {
			int rem=num%10;//145%10 =5
			int fact=0;
			for(int i=1;i<=rem;i++) {
				fact=fact*i;//60
			}
			sum=sum+fact;//0+60,
			num=num/10;
				
		}
		if(temp==sum) 
			System.out.println(temp+"is a strong number");
		else
			System.out.println(temp+" is not a strong number");
			

	}

}
