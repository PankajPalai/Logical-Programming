package com.pk.array;

import java.util.Scanner;
//Create and initialize an array with 5 integers; Display elements using enhanced for loop?
public class ArrayCreation {
	


	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		//Dynamic way of creating array
		System.out.println("enter size of an array :");
		int size=sc.nextInt();
		int [] ia=new int[size];
		System.out.println("array created with size :"+ia.length);
		System.out.println("array elements");
		for(int i:ia) {
			System.out.println(i);
		}
		
		//static way of creating array
		int[] arr= {10,20,30,40,50};
		for (int i :arr)
			System.out.println(i);
			
	}

}
