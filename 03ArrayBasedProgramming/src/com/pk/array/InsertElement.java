package com.pk.array;

import java.util.Scanner;

public class InsertElement {
	public static void main(String[] args) {
		
		
		int [] ia= {10,15,12,18,16};
		int [] arr=new int[ia.length*2];
		int index=2;
		int ele=36;
		//copy elements of old array into new array
		for(int i=0;i<ia.length;i++) {
			arr[i]=ia[i];;
		}
		System.out.println(" copy elements of old array into new array ");
		for(int i:arr) {
			System.out.println("i :" +i);
		}
		
		System.out.println("shift towards right from index");
		//shift towards right from index
		//i want 10,15,36,12,18,16
		for(int i=arr.length-2;i>=index;i--) {
			
		
			arr[i+1]=arr[i];
			
		}
		arr[index]=ele;
		
		System.out.println("\n");
	
		for(int i:arr) {
			System.out.println("i :" +i);
		}

}
}
