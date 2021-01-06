package com.nt.pk.np;

import java.util.Scanner;

//swap two numbers  using third variable
public class SwapNumber1 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("enter value of a :");
		int a=sc.nextInt();
		System.out.print("enter value of b :");
		int b=sc.nextInt();
		System.out.println("before swapping a= "+a+ " and b= "+b);
		int c=0;
		c=a;
		a=b;
		b=c;
		System.out.println("after swapping a= "+a+ " and b= "+b);

	}

}
