package com.pk.array;

import java.util.NoSuchElementException;
import java.util.Scanner;

public class ReplaceElement {
	public static void main(String[] args) {
		
		int [] ia= {10,15,12,18,16};
		
		Scanner sc=new Scanner(System.in);
		System.out.print("enter old element you want to replace :");
		int oldEle=sc.nextInt();	
		
		System.out.print("enter new element you want to add in place of "+oldEle +" :");
		int newEle=sc.nextInt();
		
		System.out.println("before replacement of element the array is :");
		for(int i:ia) {
			System.out.println(i);
		}
		
		//logic for replacing element in an array
		for(int i=0;i<ia.length;i++) {
			if(ia[i]==oldEle) {
				ia[i]=newEle;
			}
		}
		
		System.out.println("After replacement of element the array is :");
		for(int i:ia) {
			System.out.println(i);
		}
		//Replace element by index number
		
		System.out.print("enter new element :");
		int newEle2=sc.nextInt(); 
		System.out.print("Enter index number :");
		int index=sc.nextInt();
		
		
		if(index < 0 || index >=ia.length) {
			throw new IndexOutOfBoundsException(" please input index in between 0 and "+ia.length);
		}
		//replacing the element at given index
		for(int i=0;i<ia.length;i++) {
			ia[index]=newEle2;
		}
		System.out.println("After replacement of element the array is :");
		for(int i:ia) {
			System.out.println(i);
		}
		
	}
	
	

}
