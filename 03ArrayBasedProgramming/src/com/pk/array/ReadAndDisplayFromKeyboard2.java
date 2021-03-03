package com.pk.array;

import java.util.Scanner;

public class ReadAndDisplayFromKeyboard2 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("enter size of the array :");
		int [] arr=new int[sc.nextInt()];
		System.out.println("array created with length "+arr.length);
		System.out.println("enter "+arr.length+" values to array");
		for(int i=0;i<arr.length;i++) {
			System.out.print("enter val"+(i+1)+ " : ");
			arr[i]=sc.nextInt();
		}
	
	//display using for loop
		System.out.println("dislpay values using normal for loop");
		for(int i=0;i<arr.length;i++) {
			System.out.println(arr[i]);
		}
		
				

	}

}
