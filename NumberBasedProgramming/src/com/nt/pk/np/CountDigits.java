package com.nt.pk.np;


import java.util.Scanner;
class CountDigits {

	public static void countDigit(int num){
		int count=0;
		while(num>0){
			num=num/10;	//3654/10=365,36,3,0
			count++;//1,2,3,4
		}
		System.out.println("number of digits :"+count);
	}



	public static void main(String[] args) {
	
		Scanner sc=new Scanner(System.in);
		System.out.print("enter a number :");//3654
		countDigit(sc.nextInt());
	}
}
