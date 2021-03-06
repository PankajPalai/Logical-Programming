package com.pk.array;

import java.util.Scanner;

public class InsertElement {
	public static void main(String[] args) {
		
		int [] ia= {10,15,12,18,16};
		int [] arr=new int[ia.length*2];
		int index=3;
		int ele=36;
		
		System.out.println("before insertion ia[] with length :"+ia.length);
		for(int i:ia) {
			System.out.println(i);
		}

		System.out.println("after insertion arr[] with length :"+arr.length);
		for(int i:arr) {
			System.out.println(i);
		}
		
		for(int i=0;i<ia.length;i++) {
			arr[i]=ia[i];
			
		}
		
		System.out.println("after copying old array elements to new array :");
		for(int i:arr) {
			System.out.println(i);
		}
		
		//insert element with index
		for(int i=arr.length-2;i>=index;i--) {
			if(i<arr.length) {
				//System.out.println("i"+i);
			arr[i+1]=arr[i];
			}
			
			if(i==index) {
				
				arr[index]=ele;
				//break;
			}
			
		}
		
		System.out.println("after inserting elements to new array :");
		for(int i:arr) {
			System.out.println(i);
		}
	
	}
	
	
	

}
