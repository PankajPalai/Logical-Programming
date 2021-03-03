package com.pk.array;

import java.util.Scanner;

 //read array values from keyboard and display them using both for loop and enhance for loop

public class ReadAndDisplayFromKeyboard {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int [] arr=new int[5];
		System.out.println("enter values to array : ");
		for(int i=0;i<5;i++) {
			System.out.print("enter val "+(i+1)+ " : ");
			arr[i]=sc.nextInt();
		}
		
	 //display array elements using enhanced for loop
		System.out.println("the array values are");
		for(int i:arr)
			System.out.println(i);
	//display using for loop
		System.out.println("dislpay values using normal for loop");
		for(int i=0;i<arr.length;i++) {
			System.out.println(arr[i]);
		}
		
				

	}

}
