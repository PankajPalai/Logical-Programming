package com.pk.pattern;

import java.util.Scanner;

/*
 *            *
 *           ***
 *          ***** 
 *         *******
 *        *********
 *         *******
 *          *****
 *           ***
 *            *
 *        
 *        
 */

//diamond pattern having hard coding logic(always print pattern having same no. of rows )
public class Test05DiamondPattern {

	public static void main(String[] args) {
		//Scanner sc=new Scanner(System.in);
		//System.out.print("enter no of lines (odd num):");
		//int lines=sc.nextInt();
		//int mid=(lines+1)/2;
		for(int i=0;i<=4;i++) {
			//for printing spaces
			for(int s=3;s>=i;s--) {
				System.out.print(" ");
			}
			//for printing *
			for(int j=1;j<=(2*i)+1 ;j++) {
				System.out.print("*");
			}
			System.out.println();
			
		}
		//lower loop from mid
		for(int i=4;i>=1;i--) {
			//for printing spaces
			for(int s=4;s>=i;s--) {
				System.out.print(" ");
			}
			
			for(int j=(2*i)-1;j>=1;j--) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		
		
	}
		
		
	}


